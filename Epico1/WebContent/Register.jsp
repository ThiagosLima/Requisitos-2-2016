<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tela de Cadastro</title>
</head>
<body>

	<h1>Tela de Cadastro Aluno</h1>
	<form name = "register" method = "post">
		<p> Nome : <input type = "text" name = "name" size = "42" /><p>
		<p> Data de Nascimento : <input type = "text" name = "dateOfBirth" size = "10" />dd/mm/aaaa<p>
		<p> Turma : <input type = "text" name = "letterClass" size = "1" /><p>
		<p> Sala : <input type = "text" name = "room" size = "10" /><p>
		<p> Matricula : <input type = "text" name = "registration" size = "12" /><p>
		<p> Turno : <input type = "text" name = "turn" size = "10" /><p>
		<p> Ano : <input type = "text" name = "year" size = "2" /><p>
		<p> Modalidade : <input type = "radio" name = "modalityCourse" value = "EJA" />Ensino de Jovens e Adultos 
		<input type = "radio" name = "modalityCourse" value = "Normal"/> Ensino Regular</p>
		<p> Bolsista : <input type = "radio" name = "scholarship" value = "Sim" /> Sim 
		<input type = "radio" name = "scholarship" value = "Não"/> Não</p>
		<p> <input type = "submit" value = "Cadastrar" />
		
	</form>
	
</body>
</html>