<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 18.12.2024
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
<% Cart cart = (Cart) session.getAttribute("cart"); %>

<p>Name: <%= cart.getName()%>
</p>
<p>Quantity: <%= cart.getQuantity()%>
</p>
</body>
</html>
