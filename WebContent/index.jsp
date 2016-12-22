<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Página Inicial</title>


<script type="text/javascript">
	function Redirecionar() {

		var nomeInformado = prompt("Favor informar um nome: ", "");

		window.location.href = "sistema/boasvindas?nome=" + nomeInformado;
	}
</script>

</head>
<body>

	<center>
		<h2>INICIANDO O SISTEMA EM SPRING MVC</h2>
		<h3>
			<a href="#" onclick="Redirecionar();">Click aqui para informar o
				nome</a>
		</h3>
	</center>

</body>
</html>