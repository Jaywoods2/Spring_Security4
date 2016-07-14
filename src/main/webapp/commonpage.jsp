<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Common Page</title>
</head>
<body>
 <h1>Common Page</h1>  
    <p>每个人都能访问的页面.</p>  
    <a href="${pageContext.request.contextPath}/admin"> Go AdminPage </a>  
    <br />  
    <a href="${pageContext.request.contextPath}/logout">退出登录</a>  
</body>
</html>