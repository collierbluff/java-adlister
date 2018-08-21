<%--
  Created by IntelliJ IDEA.
  User: collierbluff
  Date: 8/21/18
  Time: 10:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess a Number</title>
</head>
<body>

<form action="/guess" method="post">


    <label for="number">Guess a Number Between 1 and 100</label>
    <input type="text" id="number" name="number">

    <button>Submit</button>

</form>

</body>
</html>
