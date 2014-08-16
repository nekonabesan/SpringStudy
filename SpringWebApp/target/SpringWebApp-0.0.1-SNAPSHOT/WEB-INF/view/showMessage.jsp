<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>${message}</h2>
		<form:form modelAttribute="formModel">
			<form:input path="input1" />
<%-- 			<form:checkbox path="chk1" /> --%>
			<input type="submit">
		</form:form>
	</body>
</html>
