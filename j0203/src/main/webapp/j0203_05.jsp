<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style> 
	table,th,td{border:1px solid black; border-collpase : collpase;}
	table{width: 800px;}
	
</style>
</head>
<body>
<%
	int no = 10;
	String str = "홍길동"	;
	int age =20;
	String address ="서울 영등포구 여의도동";
%>
<table>
	<tr>
	<th>제목</th>
	<th>내용</th>	
	</tr>
	<tr>
	<td>학번</td>
	<td><%=no %></td>	
	</tr>
	<tr>
	<td>이름</td>
	<td><% out.println(str); %></td>	
	</tr>
	<tr>
	<td>이름</td>
	<td><%=str %></td>	
	</tr>
</table>
</body>
</html>