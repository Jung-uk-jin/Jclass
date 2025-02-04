<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 저장하기</title>
</head>
<body>
<!-- 아이디를 쿠키에 저장, 변수명 : cook_id,  -->
	<%
	String cook_id = request.getParameter("id");
	String cook_pw = request.getParameter("pw");
	 String save_id = request.getParameter("saveId");
	 if (save_id != null) {
			Cookie cookie = new Cookie("cook_id",cook_pw);
		 	cookie.setMaxAge(60*60*24);
			response.addCookie(cookie);
	 %>
	<div><%=cook_id %>가 저장되었습니다.</div>
	<%}
	 else{
		 Cookie[] cookies = request.getCookies();
		 for(Cookie cookie : cookies){
			 if(cookie.getName().equals("cook_id")){
				 cookie.setMaxAge(0);
				 response.addCookie(cookie);				 
			 }
		 }
	 }
	%>
	<button onclick="javascript:location.href='loginOk.jsp'">이동하기</button>
	
</body>
</html>