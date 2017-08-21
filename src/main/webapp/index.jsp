<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <title>test</title>
</head>
<body>

<hr>
<c:forEach begin="1" end="10" var="i">
    ${i}<br>
</c:forEach>
    <a href="test.do">时间开始回升</a>
</body>
</html>
