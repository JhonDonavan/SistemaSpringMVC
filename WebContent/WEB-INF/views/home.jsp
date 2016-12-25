<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Boas Vindas</title>

<link rel="stylesheet" href='<c:url value="/resources/bootstrap/bootstrap.min.css" />' type="text/css" />
<link rel="stylesheet" href='<c:url value="/resources/css/style.css" />' type="text/css" />
	
<script src='<c:url value="/resources/bootstrap/jquery.js" />'></script>
<script src='<c:url value="/resources/jquery/bootstrap.min.js" />'></script>

<!--LINK BOOTSTRAP ON-LINE  -->
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous"> -->

</head>
<body>

	<h1>Bem vindo a pagina inicial do nosso projeto Spring MVC</h1>


	<div class="container">
		<div class="col-md-6 cadastro">
			<h2>Tela de cadastro</h2>
			<form>
				<div class="form-group">
					Nome <input type="text" name="nome" id="nome" class="form-control"
						required="required"></input>
				</div>

				<div class="form-group">
					Endereço <input type="text" name="endereco" id="endereco"
						class="form-control" required="required"></input>
				</div>

				<div class="form-group">
					Telefone <input type="number" name="telefone" id="telefone"
						class="form-control" required="required"></input>
				</div>

				<div class="form-group">
					E-mail <input type="email" name="email" id="email"
						class="form-control" required="required"></input>
				</div>

				<div class="form-group">
					<input type="submit" name="submit" id="submit"
						class="btn btn-primary" value="Cadastrar"></input>
				</div>

			</form>
		</div>
	</div>

</body>
</html>