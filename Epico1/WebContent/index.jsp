<!DOCTYPE html>
<html lang="pt-BR">
<head>
<title>Menu Principal</title>
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
							<a class="navbar-brand" href="#">CEF3</a>
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
										<li><a href="updateStudent">Editar Aluno</a></li>
										<li><a href="deleteStudent">Excluir Aluno</a></li>
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
	</div>
</body>
</html>