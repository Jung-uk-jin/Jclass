<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>성인입니다</h2>
	<div>나이 : <%=request.getParameter("age") %></div>
	<div>이름 : <%=request.getParameter("name") %></div>
</body>
</html>