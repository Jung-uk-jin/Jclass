<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	session.invalidate(); //모든 섹션 종료
	// removeAttribute("session_id"); 특정 세션만 종료

	response.sendRedirect("j0204+01.jsp");
%>
</body>
</html>