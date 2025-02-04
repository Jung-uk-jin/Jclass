<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
	<%
	String cookN = request.getParameter("cookN");
	
	Cookie[] cookies =request.getCookies();
	if(cookies !=null){
		for(Cookie cookie : cookies){
			if(cookie.getName().equals(cookN)){
				cookie.setMaxAge(0);
				
			}
		}
	}
	%>
	<div><%=cookN %>이 저장되었습니다.</div>
	<button onclick="javascript:location.href='./j2023_10.jsp">페이지 이동하기</button>
</body>
</html>