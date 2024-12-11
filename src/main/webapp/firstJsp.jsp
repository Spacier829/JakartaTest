<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10.12.2024
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
        <p>
            <%@page import="java.util.Date, logic.TestClass " %>
            <%
                out.println(new Date());
                out.println(new TestClass().getInfo());
            %>
        </p>
</body>
</html>
