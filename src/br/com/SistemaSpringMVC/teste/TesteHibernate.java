package br.com.SistemaSpringMVC.teste;

import br.com.SistemaSpringMVC.dominio.Cliente;
import br.com.SistemaSpringMVC.dominio.dao.ClienteDAO;

public class TesteHibernate {

	public static void main(String[] args) {
		

		Cliente c1 = new Cliente();
		ClienteDAO dao = new ClienteDAO();

		c1.setCpf("14493023783");
		c1.setEmail("jhondonavan@gmail.com");
		c1.setEndereco("Rua X");
		c1.setNome("jhon D M O");

		try {
			dao.incluir(c1);
			System.out.println("Cliente Cadastrado com sucesso");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
