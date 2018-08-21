<%--
  Created by IntelliJ IDEA.
  User: collierbluff
  Date: 8/21/18
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Make a Pizza!</title>
</head>
<body>

<form action="/pizza" method="post">

    <label for="name">Your Name</label>
    <input type="text" name="name" id="name">
    <br>

    <label for="address">Your Address</label>
    <input type ="text" name="address" id="address">
    <br>

    Pizza Size:<br>

    <select name="pizzaSize">
        <option value="small" name = "small">Small</option>
        <option value="medium" name = "medium">Medium</option>
        <option value="large" name = "large">Large</option>
    </select>

    <br>

    Pizza Toppings:<br>


        <input type="checkbox" name="ham" value = "ham" id="ham"> <label for="ham">Ham</label> <br>
        <input type="checkbox" name="onion" value = "onion" id="onion"> <label for="onion">Onion</label> <br>
        <input type="checkbox" name="mushroom" value = "mushroom" id="mushroom"> <label for="mushroom">Mushroom</label> <br>


<button>Submit</button>

</form>

</body>
</html>
