<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 24.04.2022
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Multiply</title>
</head>
<body>
<table border="1">
    <c:forEach begin="0" end="${rows}" var="i">
        <tr>
            <c:forEach  begin="0" end="${cols}" var="j">
                <c:choose>
                    <c:when test="${i==0&&j==0}">
                        <td>x</td>
                    </c:when>
                    <c:when test="${i==0&&j!=0}">
                        <td>${j}</td>
                    </c:when>
                    <c:when test="${i!=0&&j==0}">
                        <td>${i}</td>
                    </c:when>
                    <c:otherwise>
                        <td>${i * j}</td>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
        </tr>
    </c:forEach>
</table>


</body>
</html>
