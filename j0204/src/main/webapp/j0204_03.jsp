<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>시작 값 : ${param.st}</div>
<div>시작 값 : ${param.ed}</div>

<c:forEach begin="${param.st}" end="${param.ed}" step="1" var="i">
<div>값 : ${i}</div>
</c:forEach>
</body>
</html>