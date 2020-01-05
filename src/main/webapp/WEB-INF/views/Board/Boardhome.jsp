<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 	<c:forEach var="output" items="${test}" varStatus="status">
    	<c:out value="${output.name}"/>
    	<c:out value="${output.language }"/>
    	<c:out value="${output.result}"/>
	</c:forEach>
</body>
</html>