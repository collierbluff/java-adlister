<%--
  Created by IntelliJ IDEA.
  User: collierbluff
  Date: 8/21/18
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>

<form action="/pickcolor" method="POST">

    <label for="color">What's your favorite color?</label>

    <input type="text" id="color" name="color">

    <button>Submit</button>

</form>

</body>
</html>
