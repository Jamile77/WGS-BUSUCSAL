<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>

<meta charset='utf-8'>
<meta http-equiv='X-UA-Compatible' content='IE=edge'>
<title>Bus-Ucsal</title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap')
	;

@font-face {
	font-family: Quicksand;
	src: url(./assets/fonts/Quicksand_Bold.otf);
	font-style: normal;
	font-weight: 600;
}

body {
	font: 400 14px Quicksand, sans-serif;
	-webkit-font-smoothing: antialiased;
}

hr {
	border: 1px solid;
	color: #707070;
}

p {
	font-size: 17px;
	color: #4A3969;
}

.title {
	font-size: 80px;
	font-weight: 300;
	color: #2B94EE;
	text-align: center;
}

.content {
	display: inline;
	justify-content: space-around;
}

.header {
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
	margin-right: 50px;
	color: #4A3969;
	font-size: 18px;
	text-align: center;
	text-decoration: none;
}

.linha-vertical {
	height: 650px;
	border-left: 5px solid;
	color: #707070;
	margin-right: 20px;
}

.iterary-container {
	width: 100%;
	height: 100vh;
	display: flex;
	align-items: flex-end;
	justify-content: space-around;
}

.iterary-container section {
	align-self: baseline;
	text-align: left;
	width: 900px;
	margin-right: 30px;
}

.avisos {
	text-align: left;
	height: 900px;
	width: 900px;
	margin-right: 30px;
}

.title-section {
	font-size: 40px;
	font-weight: 300;
	text-align: center;
}

.sub-title {
	font-size: 25px;
	color: #4A3969;
	font-weight: bold;
	margin-bottom: 0;
}

.mural {
	padding-top: 18px;
	height: 550px;
	border: solid 15px;
	border-color: #3E3E3E;
	border-radius: 18px;
}

.proximo-onibus {
	font-size: 15px;
	display: flex;
	justify-content: space-around;
}

.title-btn {
	justify-content: space-around;
	align-items: center;
	display: flex;
}

button {
	font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto,
		Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;
	font-size: 15px;
	color: white;
	border-radius: 6px;
	background: #3A3939;
	border: none;
	width: 120px;
	height: 40px;
}

</style>


</head>

<body>

	<header class="header">
		<div class="welcome">
			<img src="../assets/img/logoucsal.svg" alt="Ucsal">
			<h2>
				BEM VINDO,
				<c:out value="${usuario.nomeUsuario}"></c:out>
			</h2>
		</div>
		<a class="logout" href="../logout">Sair</a>
	</header>

	<h1 class="title">ITINERÁRIOS</h1>

	<div class="iterary-container">
		<section>
			<div class="title-btn">
				<h1 class="title-section">ITINERÁRIO BUS-UCSAL</h1>
				<form action="">

					<button type="submit">ADICIONAR</button>
				</form>
			</div>


			<h1 class="sub-title">ROTEIRO 1:</h1>
			<p>Saída: UCSAL Pituaçu</p>
			<p>Única Parada - Av. Paralela (sentido aeroporto) Ponto do
				estádio de Pituaçu.</p>


			<h1 class="sub-title">ROTEIRO 2:</h1>
			<p>Saída: UCSAL Pituaçu</p>
			<p>Única Parada - Av. Paralela (sentido aeroporto) Ponto do
				estádio de Pituaçu.</p>


			<h1 class="sub-title">ROTEIRO 3:</h1>
			<p>Saída: UCSAL Pituaçu</p>
			<p>Única Parada - Av. Paralela (sentido aeroporto) Ponto do
				estádio de Pituaçu.</p>


			<h1 class="sub-title">ROTEIRO 4:</h1>
			<p>Saída: UCSAL Pituaçu</p>
			<p>Única Parada - Av. Paralela (sentido aeroporto) Ponto do
				estádio de Pituaçu.</p>

			<h1 class="sub-title">ROTEIRO 5:</h1>
			<p>Saída: UCSAL Pituaçu</p>
			<p>Única Parada - Av. Paralela (sentido aeroporto) Ponto do
				estádio de Pituaçu.</p>




		</section>
		<div class="linha-vertical"></div>
		
		<section class="avisos">
			<div class="title-btn">
				<h1 class="title-section">MURAL DE AVISOS</h1>
				<form action="">
					<button type="submit">ADICIONAR</button>
				</form>
			</div>
			<div class="mural"></div>
		</section>

	</div>
</body>

</html>