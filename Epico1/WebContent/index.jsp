
<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.awt.image.renderable.RenderContext"%>
<%@page import="java.nio.file.Path"%>
<%@page import="org.apache.tomcat.util.http.fileupload.RequestContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Controle de Alunos</title>
<style>
body {
	background-image: url("images/cef03background.jpg"); 
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size:cover;
}
</style>
</head>
<body >
<h3><center>Centro de Ensino Fundamental 03 do Gama </h3>
<h4><center> Seja bem vindo</h4>

<form  action="ValidateLogin" >
<p><center> Login: <input type="text" name="login" size="30"  /> </p>
<p> Senha: <input type="text" name="password" size="30" /> </p>
<p> <input type="radio" name="user" value="D"/> Diretor </p> 
<p> <input type="radio" name="user" value="F"/> Funcionário</p> 
<p> <input type="radio" name="user" value="R"/> Responsável</p> 
<%
String erro = (String) request.getAttribute("erro");
if(erro != null && erro.length() != 0 ){
%>
<p style='color: red'> <%= erro %></p>
<%
}
%>
<p> <input type="submit" value="Login" name="LoginButton" />  </p>
