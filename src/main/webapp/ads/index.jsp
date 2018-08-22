<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: collierbluff
  Date: 8/22/18
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Ad List</title>
</head>
<body>

<c:forEach var="item" items="${ads}">

    <h1>${item.title}</h1>
    <p>${item.description}</p>
    <h5>Item ID: ${item.id}</h5>
    <h5>User ID: ${item.userId}</h5>


</c:forEach>

</body>
</html>
