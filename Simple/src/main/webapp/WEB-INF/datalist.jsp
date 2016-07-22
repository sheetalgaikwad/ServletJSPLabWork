<%--
  Created by IntelliJ IDEA.
  User: shgaikwa
  Date: 7/21/2016
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <div class="col-md-9">
        <table border="1" align="center">
            <tr>
                <c:forEach var="title" items="${title}">
                    <td><b>${title}</b></td>
                </c:forEach>
            </tr>
            <c:forEach var="prod" items="${data}">
                <tr>
                    <td>${prod.name}</td>
                    <td>${prod.desc}</td>
                    <td>${prod.quantity}</td>
                    <td>$${prod.price}</td>
                </tr>
            </c:forEach>
        </table>

</div>

</body>
</html>
