package br.com.SistemaSpringMVC.dominio.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import br.com.SistemaSpringMVC.dominio.Cliente;

public class ClienteDAO {
	private EntityManager manager = null;

	public ClienteDAO() {
		super();
		EntityManagerFactory criando = Persistence.createEntityManagerFactory("SistemaSpringMVC");
		manager = criando.createEntityManager();
	}

	public void incluir(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.flush();
		manager.getTransaction().commit();
	}

	public void alterar(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.merge(cliente);
		manager.flush();
		manager.getTransaction().commit();
	}

	public void excluir(Cliente cliente) {
		
		manager.getTransaction().begin();
		manager.remove(cliente);
		manager.flush();
		manager.getTransaction().commit();
	}
}
