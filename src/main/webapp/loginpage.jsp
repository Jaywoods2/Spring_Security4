<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<h1>Login</h1>
	<form action="j_spring_security_check" method="post">

		<p>
			<label for="j_username">Username</label> <input id="j_username"
				name="j_username" type="text" />
		</p>

		<p>
			<label for="j_password">Password</label> <input id="j_password"
				name="j_password" type="password" />
		</p>

		<input type="submit" value="Login" />

	</form>
	<div id="login-error">${error}</div>
</body>
</html>