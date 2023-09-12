<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h2> List Page</h2>
</div>

<div>
	<table width = "100%">
		<tr>
			<th>글번호</th>
			<th>글제목</th>
			<th>작성자</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="item" items = "${boardList}" >
		<tr>
			<td>${item.bno}</td>
			<td>${item.title}</td>
			<td>${item.writer}</td>
			<td><fmt:formatDate pattern="yyyy-MM-dd" value="${item.regDate}"/></td>
		<tr>
		</c:forEach>
	</table>
</div>
	
	

</body>
</html>
