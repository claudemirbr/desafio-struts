<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
    <script src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <title>Contatos</title>
</head>
<body>
<%@ include file="menu.jsp"%>
<main role="main" class="container">
<h1>Êxito</h1>

<s:a class="btn btn-primary" href="novocontato" >Novo</s:a>

<table class="table table-sm table-striped">
    <tr>
        <td>Id</td>
        <td>Nome</td>
        <td>E-mail</td>
        <td>Ações</td>
    </tr>

    <s:iterator value="contatos" var="contato">
        <tr>
            <td><s:property value="#contato.id"/></td>
            <td><s:property value="#contato.nome"/></td>
            <td><s:property value="#contato.email"/></td>
            <td>
				<a href="editarcontato?id=<s:property value="#contato.id"/>">
					<button class="btn btn-warning">Editar</button>
				</a>
                <a href="excluircontato?id=<s:property value="#contato.id"/>">
                    <button class="btn btn-danger">Excluir</button>
                </a>
            </td>
        </tr>
    </s:iterator>
</table>
</main>
</body>
</html>