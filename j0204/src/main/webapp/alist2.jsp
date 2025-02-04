<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.naver.www.member"%>
<%@page import="java.text.Normalizer.Form"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String[] id = {"aaa","bbb","ccc","ddd","eee","fff"
		,"ggg","hhh","iii","jjj"};
String[] name = {"홍길동","유관순","이순신","강감찬","김구","김유신"
		,"홍길자","홍길순","을지문덕","신사임당"};
String[] hobby = {"게임,골프,수영","게임","수영","독서,독서","게임","골프"
		,"조깅,골프","수영,조깅","조깅","조깅"};
ArrayList<member> list = new ArrayList();
for(int i=0 ; i<10 ; i++){
	list.add(new member(id[i], name[i], hobby[i]));
}

session.setAttribute("list", list);
%>
<form action="./j0204_06.jsp" method="Post">
<label>값</label>
<input type="submit" name="전송">
</form>
</body>
</html>