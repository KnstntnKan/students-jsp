package webapp.servlets;


import exigen.students.App;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/answer.jsp");
        rd.forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        reqest.setCharacterEncoding("UTF-8");
        String a = reqest.getParameter("question");
        HttpSession session = reqest.getSession();
        session.setAttribute("answer", App.getResponse(a));

        RequestDispatcher reqDisp = reqest.getRequestDispatcher("/answer.jsp");
        reqDisp.forward(reqest, response);
    }
}
