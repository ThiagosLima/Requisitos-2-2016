<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Cadastro de Aluno</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<style>
body {<!--
	background-image:
		url("https://espalhafactos.com/wp-content/uploads/2016/06/dragonballsuper.jpg");
	-->
	background-color: #FFFFFF;
}

.topo {
	margin-top: 30px !important;
}

.css img {
	float: right;
	width: 70%;
	border: thin solid;
	padding: 5px;
	margin: 0px 10px 10px 0;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<nav class="navbar navbar-default topo">
					<div class="container-fluid">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed"
								data-toggle="collapse"
								data-target="#bs-example-navbar-collapse-1"
								aria-expanded="false">
								<span class="sr-only">Toggle navigation</span> <span
									class="icon-bar"></span> <span class="icon-bar"></span> <span
									class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="MenuPrincipal.jsp">CEF3</a>
						</div>

						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav">

								<!-- <li class="active"><a href="index.php">Home</a></li> -->

								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Responsavel <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="insertResponsible">Adicionar Responsável</a></li>
										<li><a href="updateResponsible">Editar Responsável</a></li>
										<li><a href="deleteResponsible">Excluir Responsável</a></li>
									</ul></li>

								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Aluno <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="RegisterStudent.jsp">Adicionar Aluno</a></li>
										<li><a href="UpdateStudent.jsp">Editar Aluno</a></li>
										<li><a href="DeleteStudent.jsp">Excluir Aluno</a></li>
									</ul></li>

								<li class="dropdown"><a href="#" class="dropdown-toggle"
									data-toggle="dropdown" role="button" aria-haspopup="true"
									aria-expanded="false">Relatório <span class="caret"></span></a>
									<ul class="dropdown-menu">
										<li><a href="report">Gerar Relatório</a></li>
									</ul></li>
								<li></li>
							</ul>
							<form class="navbar-form navbar-right" role="search">
								<div class="form-group">
									<input type="text" class="form-control"
										placeholder="Procurar por um aluno/responsável pelo nome"
										style="width: 326px">
								</div>
								<button type="submit" class="btn btn-default">Procurar</button>
							</form>
						</div>
					</div>
				</nav>
			</div>
		</div>

		<!-- A PARTE DE CIMA ACABA AQUI! -->
		<div class="row">
			<div class="col-md-12">
				<h1>Editar Aluno</h1>
				<form action="UpdateStudentServlet?acao=Alterar" method="post">
					<div class="row">
						<div class="col-md-4">
							<div class="form-group">
								<label>Nome:</label> <input type="text" name="name_student"
									class="form-control" />
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<label>Matrícula:</label> <input type="text"
									name="registration_student" class="form-control"
									style="width: 100px" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-2">
							<div class="form-group" >
								<label>Sala:</label> <input type="number" name="room_student"
									class="form-control" style="width: 70px" />
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<label>Turma:</label> <input type="text"
									name="letter_class_student" class="form-control"
									style="width: 50px" />
							</div>
						</div>
						<div class="col-md-4">
							<div class="form-group">
								<label>Bolsista:</label> <br> <input type="radio"
									name="scholarship_student" value="yes"> Sim <input
									type="radio" name="scholarship_student" value="no"> Não
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-2">
							<div class="form-group">
								<label>Data de Nascimento:</label> <input type="date"
									name="dateOfBirth_student" class="form-control"
									style="width: 160px" />
							</div>
						</div>
						<div class="col-md-2">
							<div class="form-group">
								<label>Ano:</label> <input type="number" name="year_student"
									class="form-control" style="width: 60px" />
							</div>
						</div>
						<div class="col-md-3">
							<div class="form-group">
								<label>Turno:</label> <br> <input type="radio"
									name="turn_student" value="morning_student"> Matutino <input
									type="radio" name="turn_student" value="afternoon_student">
								Vespertino
							</div>
						</div>
						<div class="col-md-5">
							<div class="form">
								<input type="file" name="image">
								<button class="btn btn-sm upload" type="submit">Upload</button>
								<button type="button" class="btn btn-sm cancel"></button>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="form-group">
								<label>Etapa/Modalidade do Curso:</label> <br> <input
									type="radio" name="modalityCourse_student" value="eja_student">
								EJA - Educação de Jovens e Adultos <input type="radio"
									name="modalityCourse_student" value="normal_student">
								Normal
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12">
							<button type="submit" class="btn btn-success"><li><a href="MenuPrincipal.jsp">Alterar Aluno</a></li></button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>