<!DOCTYPE html>
<%@page import="br.ucsal.busucsal.model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style type="text/css">
@import
	url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap')
	;

@font-face {
	font-family: Quicksand;
	src: url(../assets/fonts/Quicksand_Bold.otf);
	font-style: normal;
	font-weight: 600;
}

body {
	font: 400 14px Quicksand, sans-serif;
	-webkit-font-smoothing: antialiased;
}

form {
	width: 50%;
}

form h1 {
	font-size: 20px;
}

form div button {
	font-family: Quicksand;
	font-weight: 600;
	font-size: 20px;
	color: white;
	background: #17EB88;
	height: 40px;
	width: 174px;
	border: none;
	border-radius: 6px;
}

input {
	margin-top: 0;
	font-size: 25px;
	padding-left: 15px;
	height: 57px;
	width: 500px;
	background-color: #3A3939;
	border: none;
	border-radius: 6px;
	color: aliceblue;
}

section {
	text-align: center;
	align-items: center;
}

H1 {
	font-size: 30px;
}

button {
	font-family: Quicksand;
	font-weight: 600;
	font-size: 20px;
	color: white;
	background: #17EB88;
	height: 53px;
	width: 300px;
	border: none;
	border-radius: 25px;
}

textarea {
	font-size: 16px;
	padding: 15px;
	height: 200px;
	width: 700px;
	background-color: #3A3939;
	border: none;
	border-radius: 6px;
	color: aliceblue;
}

.btn {
	margin-left: 20%;
	margin-top: 20px;
}

.title {
	font-size: 80px;
	font-weight: 300;
	color: #2B94EE;
	text-align: center;
}

.header {
	width: 100%;
	margin: 0 auto;
	display: flex;
	align-items: center;
	justify-content: space-between;
	color: #4A3969;
}

.header .welcome {
	align-items: center;
	display: flex;
	font-size: 15PX;
}

.logout {
	margin-right: 13px;
	background: #4A3969;
	color: white;
	width: 170px;
	height: 63px;
	border: none;
	border-radius: 10px;
	font-size: 23px;
	font-weight: bold;
}

.content {
	width: 100%;
	align-items: center;
	display: flex;
	justify-content: space-around;
}

.avisos {
	align-items: center;
	display: flex;
	justify-content: center;
}
</style>
</head>

<body>
	<header class="header">
		<div class="welcome">
			<img src="../assets/img/logoucsal.svg" alt="Ucsal">
			<H1>
				BEM VINDO,
				<c:out value="${usuario.nomeUsuario}"></c:out>
			</H1>
		</div>
		<form action="logout" class="logout">
			<button type="submit" class="logout">LOGOUT</button>
		</form>
	</header>
	<h1 class="title">CADASTRO DE COLABORADOR</h1>


	<div class="content">
		<form action="cadastrocolaborador">

			<div>
				<h1>INFORME O LOGIN</h1>
				<input placeholder="LOGIN" name="login" type="text">
			</div>

			<div>
				<h1>INFORME A SENHA</h1>
				<input placeholder="SENHA" name="key" type="password">
			</div>
			<div>
				<h1>INFORME O NOME COMPLETO</h1>
				<input placeholder="NOME COMPLETO" name="fullname" type="text">
			</div>
			<div>
				<h1>INFORME A FUNÇÃO</h1>
				<input placeholder="FUNÇÃƒO" name="function" type="text">
			</div>

			<div class="btn">
				<button type="submit" >CADASTRAR</button>
			</div>
		</form>
		
		<section>
			<H1>GERENCIAR COLABORADOR</H1>
			<button>GERENCIAR</button>

			<H1>ALTERAR COLABORADOR</H1>
			<button>ALTERAR</button>

			<H1>VER COLABORADOR</H1>
			<button>VISUALIZAR</button>
		</section>
	</div>

	<h1 class="title">CADASTRO DE AVISOS</h1>

	<div class="avisos">
		<form action="cadastrar-aviso">

			<div>
				<h1>INFORME O TITULO DO AVISO</h1>
				<input placeholder="TITULO" type="text">
			</div>

			<div>
				<h1>INFORME O CONTEUDO DO AVISO</h1>
				<textarea>...</textarea>
			</div>

		</form>
	</div>


</body>

</html>