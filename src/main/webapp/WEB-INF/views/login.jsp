<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello..!!fromJSP</title>
</head>
<body>
<%-- My name is ${name} and password is ${password} --%>
<form action="/spring-mvc/login" method="post">
<p><font color="red">${ErrorMessage}</font></p>
Enter the name<input type="text" name="name"/>Password<input type="password" name="password"/> <input type="submit"/>
</form>
</body>
</html>