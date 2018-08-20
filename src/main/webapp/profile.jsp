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
    <title>Profile</title>
</head>
<body>

<h1>Here's Your Profile</h1>

<button id="return">Go Back To Login?</button>


<script>

    document.getElementById('return').addEventListener("click", function () {

        window.location = "http://localhost:8080/login.jsp"
    })

</script>

</body>
</html>
