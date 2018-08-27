<%--
  Created by IntelliJ IDEA.
  User: collierbluff
  Date: 8/24/18
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Here!</title>
</head>
<body>

<h2>Registration Form</h2>


<form action="/register" method="post">

    <label for="username">Username</label>

    <input type="text" id="username" name="username"><br>

    <label for="email">Email</label>

    <input type="text" id="email" name="email"><br>

    <label for="password">Password</label>

    <input type="text" id="password" name="password"><br>

    <button>Submit</button>

</form>


</body>
</html>
