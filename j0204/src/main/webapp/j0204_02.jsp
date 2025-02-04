<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
<%String sid="aaa"; %>
<div>스크립트릿 id : <%=sid %></div>
<c:set var="id" value="aaa"></c:set>
<div>변수값 : ${id} </div>
<c:set var="score" value="99"></c:set>
<div>점수 : ${score} </div>
<c:if test="${id=='bbb' }">
	<div>id는 bbb입니다.</div>
</c:if>
<c:if test="${id!='bbb' }">
	<div>id는 bbb가 아닙니다.</div>
</c:if>
<c:forEach begin="1" end="10" step="1" var="i">
<div>i변수값 : ${i}</div>
</c:forEach>

<c:choose>
<c:when test="${score>=90 }">
<div>성적 : A</div>
</c:when>
<c:when test="${score>=80 && score<90}">
<div>성적 : B</div>
</c:when>
<c:when test="${score>=70 && score<80}">
<div>성적 : C</div>
</c:when>
<c:when test="${score>=60 && score<70}">
<div>성적 : D</div>
</c:when>
<c:when test="${score>=50 && score<60}">
<div>성적 : E</div>
</c:when>
</c:choose>

</body>
</html>