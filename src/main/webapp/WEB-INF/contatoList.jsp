<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contatos</title>
</head>
<body>

	<h1>Êxito</h1>

	<s:a href="novocontato">Novo</s:a>
	<table>
		<tr>
			<td>Id</td>
			<td>Nome</td>
			<td>E-mail</td>
			<td>Ações</td>
		</tr>


		<s:iterator value="lista">
			<tr>

				<td><s:property value="id" /></td>
				<td><s:property value="nome" /></td>
				<td><s:property value="email" /></td>
				<td><!-- <s:url id="editar_contato" action="editarcontato">
						<s:param name="id">${id}</s:param>
					 </s:url> --> <s:a action="%{editar_contato}">Editar</s:a></td> 
			</tr>


		</s:iterator>
	</table>

</body>
</html>