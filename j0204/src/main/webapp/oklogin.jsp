<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
</head>
<body>
<h2>로그인 확인</h2>
<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	session.setAttribute("session_id", id);
	if(id.equals("aaa") && pw.equals("1111")){
		session.setAttribute("session_id", id);
		
	}
	
%>
<div>아이디 : <%=id %></div>
<div>비밀번호 : <%=pw %></div>

<button onclick="javascript:location.href='j0204_01.jsp'">이동하기</button>
</body>
</html>