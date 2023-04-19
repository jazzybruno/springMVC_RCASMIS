<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<jsp:include page="headerlogin.jsp">
	<jsp:param value="Login" name="title" />
</jsp:include>
<div id="middle">
	<fieldset>
		<legend>User Authentication Form</legend>
		<form action="login.php" method="post">
			<table>
				<tr>
					<td align="right"><b><t:field mandatory="yes"
								text="Username"></t:field></b></td>
					<td align="left"><input type="text" size="25" maxlength="50"
						name="username" id="username" /></td>
				</tr>
				<tr>
					<td align="right"><b><t:field mandatory="yes"
								text="Password"></t:field></b></td>
					<td align="left"><input type="password" size="25"
						maxlength="50" name="password" id="password" /></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
				</tr>

				<tr bgcolor="gray">
					<td align="right">&nbsp;</td>
					<td align="left"><input type="submit" value="Login" /></td>
				</tr>
			</table>
		</form>
		<c:if test="${authenticatedUser ==null}">
			<table>
				<tr>
					<td align="center"><a
						href="createuser.php?page=createuser"> <img
							src="icons/user_add.png" /> New User Registration
					</a></td>
				</tr>
			</table>
		</c:if>
	</fieldset>
</div>
<%@ include file="footerlogin.jsp"%>
