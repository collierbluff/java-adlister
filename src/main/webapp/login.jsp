<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: collierbluff
  Date: 8/20/18
  Time: 12:00 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<%
    String userPass = request.getParameter("user") + request.getParameter("pass");

    if(userPass.equals("adminpassword")){

        response.sendRedirect("profile.jsp");
    }
%>

<form action="login.jsp" method="POST">

    <label for="user" >Username:</label> <br>
    <input type = "text" id="user" name="user"><br>

    <label for="pass" >Password:</label> <br>
    <input type = "text" id="pass" name="pass"><br>


    <input type="submit" value="Submit">

</form>


</body>
</html>
