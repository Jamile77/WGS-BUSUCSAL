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

<style type="text/css">
body{
    font: 400 14px Roboto, sans-serif;
    background: #FFFFFF;
    -webkit-font-smoothing: antialiased;
}

hr{
    border: 1px solid;
    color: #707070;
}

p{
    font-size: 20px;
    color: #4A3969;
}

.title{
	margin-top: 50px;
    width: 2px;
    height: 40px;

    display: flex;
    margin-left: 33%;
    margin-right: auto;
}

.title h1{
    font-size: 80px;
    font-weight: 300;
    color: #2B94EE;
    margin-top: 30px;
}

.header{
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

.logout{
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

.linha-vertical {
    height: 700px;
    border-left: 5px solid;
    color: #707070;
  }

.iterary-container{
    width: 100%;
    height: 100vh;
    margin: 0 auto;

    display: flex;
    align-items: center;
    justify-content: space-around;
}

.iterary-container section {
    text-align: left;
    width: 900px;
    margin-right: 30px;
    margin-top: 600px;
}

.avisos{
    text-align: left;
    height: 800px;
    width: 900px;
    margin-right: 30px;
}

.title-section{
    font-size: 50px;
    font-weight: 300;
    text-align: center;
}

.sub-title{
    font-size: 30px;
    color: #4A3969;
    font-weight: bold;
    margin-bottom: 0;
}

.mural{
    padding-top: 18px;
    height: 650px;
    border: solid 15px;
    border-color: #3E3E3E;
    border-radius: 18px;
}

.proximo-onibus{
    font-size: 20px;
    display: flex;
    justify-content: space-evenly;
}

.logo {
    align-self: flex-start;
    float: left;
}


</style>
</head>

<body>

	<header class="header">
		<div class="welcome">
			<img class="logo" src="./assets/img/logoucsal.svg" alt="Ucsal">
			<H1>
				BEM VINDO,
				<c:out value="${usuario.nomeUsuario}" />
			</H1>
		</div>
		<button type="button" class="../logout">LOGOUT</button>
	</header>

	<div class="title">
		<h1>ITINERÁRIOS</h1>
	</div>


	<div class="iterary-container">
		<section>
			<h1 class="title-section">ITINERÁRIO BUS-UCSAL</h1>


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
			<h1 class="title-section">Mural de Avisos</h1>
			<div class="mural">
				<div class="proximo-onibus">
					<h1>PRÓXIMO BUSU A SAIR:</h1>
					<h1 class="proximo-roteiro">ROTEIRO 1 (11:45)</h1>
				</div>
				<hr>
			</div>
		</section>

	</div>
</body>

</html>