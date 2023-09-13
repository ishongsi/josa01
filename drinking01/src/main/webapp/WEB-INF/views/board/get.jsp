<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
	제목
	<input type = "text" name = "title" value = "${board.title}" readonly = "readonly">
</div>
<div>
내용
	<textarea rows="20" cols="50" name = "content" readonly = "readonly"><c:out value = "${board.content}"/></textarea>
</div>
<div>
작성자
	<input type = "text" name = "writer" readonly = "readonly" value = "${board.writer}">
</div>	

<input type = "submit" value = "작성">

</body>
</html>