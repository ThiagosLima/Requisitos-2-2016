<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Menu Principal</title>
</head>
<body>
<%
String user = (String) request.getAttribute("user");

if (user != null){	
	if ("D".equals(user) ){ %>
		<h5>TIPO DE USUÁRIO: DIRETOR  </h5> 
		<tr>
			<td><form action="OpenRegistrationStudent">
			<input type="submit" name='aluno' value="ALUNO" >
			</form>
			 </td>
			<td><input type="submit" name='responsavel' value="RESPONSÁVEL" ></td>
			<td><input type="submit" name='funcionario' value="FUNCIONÁRIO" ></td>
		</tr> 
	<%}
	if ("R".equals(user) ){%>
		<h5>TIPO DE USUÁRIO: RESPONSÁVEL  </h5><% 
	}
	if ("F".equals(user) ){%>
		<h5>TIPO DE USUÁRIO: FUNCIONÁRIO  </h5>
	<% }}%>
	<p><a href='index.jsp'> Logout</a></p>


</body>
</html>