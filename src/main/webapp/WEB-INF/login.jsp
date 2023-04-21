<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%--<jsp:include page="headerlogin.jsp">--%>
<%--	<jsp:param value="Login page" name="title" />--%>
<%--</jsp:include>--%>
<%--<div id="middle">--%>

<%--		<form action="login.php" method="post">--%>
<%--			<table>--%>
<%--				<tr>--%>
<%--					<td align="right"><b><t:field mandatory="yes"--%>
<%--								text="Username"></t:field></b></td>--%>
<%--					<td align="left"><input type="text" size="25" maxlength="50"--%>
<%--						name="username" id="username" /></td>--%>
<%--				</tr>--%>
<%--				<tr>--%>
<%--					<td align="right"><b><t:field mandatory="yes"--%>
<%--								text="Password"></t:field></b></td>--%>
<%--					<td align="left"><input type="password" size="25"--%>
<%--						maxlength="50" name="password" id="password" /></td>--%>
<%--				</tr>--%>
<%--				<tr>--%>
<%--					<td></td>--%>
<%--					<td></td>--%>
<%--				</tr>--%>

<%--				<tr bgcolor="gray">--%>
<%--					<td align="right">&nbsp;</td>--%>
<%--					<td align="left"><input type="submit" value="Login" /></td>--%>
<%--				</tr>--%>
<%--			</table>--%>
<%--		</form>--%>
<%--		<c:if test="${authenticatedUser ==null}">--%>
<%--			<table>--%>
<%--				<tr>--%>
<%--					<td align="center"><a--%>
<%--						href="createuser.php?page=createuser"> <img--%>
<%--							src="icons/user_add.png" /> New User Registration--%>
<%--					</a></td>--%>
<%--				</tr>--%>
<%--			</table>--%>
<%--		</c:if>--%>
<%--</div>--%>
<%--<%@ include file="footerlogin.jsp"%>--%>
<!DOCTYPE html>
<html>
<head>
	<title>RCA SMIS</title>
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
	<link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@300;400;500&display=swap" rel="stylesheet">
	<style>
		body {
			background-color: #f2f2f2;
		}

		.container {
			margin: 50px auto;
			margin-top: 10%;
			width: 400px;
			height: 400px;
			background-color: #ffffff;
			padding: 20px;
			border-radius: 5px;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.3);
			position: relative;
			justify-content: center;
			display: flex;
			flex-direction: column;
		}

		.container img {
			position: absolute;
			top: -50px;
			left: 50%;
			transform: translateX(-50%);
			width: 100px;
			height: 100px;
			border-radius: 50%;
			background-color: #ffffff;
			padding: 5px;
			box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
		}

		h2{
			text-align: center;
			color: #333333;
			font-family: 'Quicksand', sans-serif;
		   margin-top: 10px;
		}
		p,a{
			text-align: center;
			font-family: 'Quicksand', sans-serif;
			text-decoration: none;
		}

		input[type="text"], input[type="password"] {
			width: 93%;
			padding: 10px;
			margin-bottom: 20px;
			border: none;
			border-radius: 5px;
			background-color: #f2f2f2;
			color: #333333;
			font-size: 16px;
			box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
		}

		input[type="submit"] {
			width: 100%;
			padding: 10px;
			border: none;
			border-radius: 5px;
			background-color: #29375A;
			color: #ffffff;
			font-size: 16px;
			cursor: pointer;
			box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.3);
		}

	</style>
</head>
<body>
<div class="container">
	<img src="https://media.licdn.com/dms/image/C560BAQEl6a9tUkSKfg/company-logo_200_200/0/1558604414993?e=2147483647&amp;v=beta&amp;t=liCSw94UkEjwbMZZh8N23ZMYixEAMmZNq2IftvsF97Y" alt="LinkedIn Logo">
	<h2>Sign In</h2>
	<p>Welcome to RCA SMIS.Please enter your details.</p>
	<c:if test="${error != null}">
			<p style="color: red">${error}</p>
	</c:if>
	<form action="login.php" method="post">
		<input type="text" placeholder="Username" required name="username">
		<input type="password" placeholder="Password" required name="password">
		<input type="submit" value="Sign In">
		<p>Create an account <span><a href="createuser.php?page=createuser"> Sign up</a>	</span></p>

	</form>
</div>
</body>
</html>

