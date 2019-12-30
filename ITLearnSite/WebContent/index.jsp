<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${path}/css/container.css" rel="stylesheet">
</head>
<body>
	<div class="header">
		<jsp:include page="/include/header.jsp"></jsp:include>
	</div>
	<div class="container">
		<h1>BODY</h1>
	
	</div>
	<div>
		<jsp:include page="/include/footer.jsp"></jsp:include>
	</div>
</body>
</html>