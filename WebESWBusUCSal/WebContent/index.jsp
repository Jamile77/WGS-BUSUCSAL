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

@import url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');

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

.logon{
    width: 100%;
    height: 75vh;
    margin: 0 auto;

    display: inline-flex;
    align-items: center;
    justify-content: space-between;
}


.header {
    width: 100%;
    display: flex;
    height: 100px;
}

.logo {
    align-self: flex-start;
    float: left;
}

.home {
    width: 50%;
    align-self: flex-start;
    text-align: right;
    color: #4A3969;
}

.first {
    color: #2B94EE;
    font-size: 60px;
    margin-left: 53px;
    line-height: 15px;
}

.second {
    color: #ADB0B2;
    font-size: 30px;
    margin-left: 58px;
    line-height: 5px;
    margin-bottom: 60px;
}

p {
    width: 50%;
    font-size: 19px;
    text-align: left;
    margin-left: 58px;
    margin-bottom: 50px;
    font-family: Roboto;
}

form input {
    width: 100%;
    height: 40px;
    color: #333;
    border: 1px solid #dcdce6;
    border-radius: 8px;
    padding: 0 15px;
    margin-bottom: 20px;
    font-family: Quicksand;
    box-shadow: 0px 2px 2px rgba(128, 128, 128, 0.226);
}

input, textarea, select, button {
    outline: 0;
}

.logon form {
    width: 100%;
    max-width: 350px;
    margin-left: 110px;
}

.button {
    width: 35%;
    height: 36px;
    background: #2B94EE;
    border: 0;
    border-radius: 8px;
    color: #FFF;
    font-weight: bold;
    margin-left: 120px;
    display: inline-block;
    text-align: center;
    text-decoration: none;
    font-size: 14px;
    line-height: 30px;
    transition: filter 0.2s;
    font-family: Quicksand;
}

.button:hover {
    filter: brightness(90%)
}

</style>

</head>

<body>
	<div class="header">
		<img class="logo" src="./assets/img/logoucsal.svg" alt="Ucsal">
	</div>
	<div class="logon">
		<div class="login">
			<div class="title">
				<h1 class="first">BUS-UCSAL</h1>
				<h1 class="second">SMART CAMPUS</h1>
			</div>

			<p>Um serviço perfeito pra você, aluno, que quer saber a situação
				do nosso querido Busu! Com várias funcionalidades, seja roteiro,
				horários e avisos prévios.</p>

			<form action="login" method="post">
				<input type="text" name="user" id="inputEmail" class="form-control"
					placeholder="Usuário" required autofocus> <input
					type="password" name="pass" id="inputPassword" class="form-control"
					placeholder="Senha" required>
				<button class="button" type="submit">Acessar</button> <br>
				<c:out value="${erro}"></c:out>
			</form>
		</div>

		<img class="background" src="./assets/img/Background.svg">
	</div>
</body>

</html>