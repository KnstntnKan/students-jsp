<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
<h2>Namaste!</h2>
<form method="post">
   Могу ли я <input name="question">
   <br>
   <input class="btn" type=submit>
   </form>   <br>
   ${sessionScope.answer}
</body>
</html>
