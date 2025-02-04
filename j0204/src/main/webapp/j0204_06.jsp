<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table,th,td{border:0.5px solid black.; border-collapse:collapse;}
	table{width:900px;,margin:10px auto; text-algin:center;}
	th,td{height:30px};
</style>
</head>
<body>
	<h2>리스트 출력</h2> 
<table>
	<tr>
		<th>아이디</th>
		<th>이름</th>
		<th>취미</th>
	</tr>
		<c:forEach items="${list}" var="member">
	<tr>
		<td>${member.id }</td>
		<td>${member.name}</td>
		<td>${member.hobby}</td>
	</tr>
		</c:forEach>
</table>
<hr>
<h2>홍길동 회원정보</h2>
<form>
<label>아이디</label>
<input type="text" name="id" value="${list[0].id}"><br/>
<label>이름</label>
<input type="text" name="name" value="${list[0].name }"><br/>
<input type="checkbox" id="game" name="hobby" value="게임"
<c:if test="${fn:contains($(list[0].hobby,'게임')}">checked</c:if>>
<label for="game">게임</label>
<input type="checkbox" id="swim" name="hobby" value="수영">
<c:if test="${fn:contains($(list[0].hobby,'수영')}">checked</c:if>>
<label for="swim">수영</label>
<input type="checkbox" id="golf" name="hobby" value="골프" checked>
<c:if test="${fn:contains($(list[0].hobby,'골프')}">checked</c:if>>
<label for="golf">골프</label>
<input type="checkbox" id="jogging" name="hobby" value="조깅">
<c:if test="${fn:contains($(list[0].hobby,'조깅')}">checked</c:if>>
<label for="jogging">조깅</label>
<input type="checkbox" id="book" name="hobby" value="독서" checked>
<c:if test="${fn:contains($(list[0].hobby,'독서')}">checked</c:if>>
<label for="book">독서</label>

</form>
</body>
</html>