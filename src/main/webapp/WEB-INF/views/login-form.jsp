<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
	<h1 style="color: red">${message}</h1>
  	<hr />

	<h1>Login Form</h1>
	<form:form action="saveLoginForm" method="post" modelAttribute="user">
      	<form:label path="username">Username:</form:label>
      	<form:input path="username"/>
      	<form:label path="password">Password:</form:label>
      	<form:password path="password"/>
      	<form:button cssClass="btn btn-primary">Submit</form:button>
     </form:form>
</body>
</html>