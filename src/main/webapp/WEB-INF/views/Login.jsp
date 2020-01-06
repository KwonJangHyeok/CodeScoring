<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="EUC-KR">
	<link rel="stylesheet" type="text/css" href="<c:url value="/css/Login.css"/>">
	
<title>Insert title here</title>
</head>
<body>
	<div class="login-page">
	  <div class="form">
	    <form class="register-form">
	      <input type="text" placeholder="name"/>
	      <input type="password" placeholder="password"/>
	      <input type="text" placeholder="email address"/>
	      <button>create</button>
	      <p class="message">Already registered? <a href="#">Sign In</a></p>
	    </form>
	    
	    <form class="login-form" method="post">
	      <input type="text" 	 name="userid" placeholder="username"/>
	      <input type="password" name = "pw" placeholder="password"/>
	      <button>login</button>
	      
	      <p class="message">Not registered? <a href="#">Create an account</a></p>
	    </form>
	  </div>
	</div>
</body>
</html>




