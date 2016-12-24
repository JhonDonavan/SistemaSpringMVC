package br.com.SistemaSpringMVC.dominio.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.SistemaSpringMVC.dominio.Cadastro;

public class CadastroDAO {

	public CadastroDAO() {
		super();
	}

	/**
	 * M�todo utilizado para obter o entity manager.
	 * 
	 * @return
	 */
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = null;
		EntityManager entityManager = null;
		try {
			// Obt�m o factory a partir da unidade de persist�ncia.
			factory = Persistence.createEntityManagerFactory("SistemaSpringMVC");
			// Cria um entity manager.
			entityManager = factory.createEntityManager();
			// Fecha o factory para liberar os recursos utilizado.
		} finally {
			factory.close();
		}
		return entityManager;
	}

	public Cadastro salvar(Cadastro cadastro) throws Exception {
		EntityManager entityManager = getEntityManager();
		try {
			// Inicia uma transa��o com o banco de dados.
			entityManager.getTransaction().begin();
			System.out.println("Salvando a cadastro.");
			// Verifica se a cadastro ainda n�o est� salva no banco de dados.
			if (cadastro.getId() == null) {
				// Salva os dados da cadastro.
				entityManager.persist(cadastro);
			} else {
				// Atualiza os dados da cadastro.
				cadastro = entityManager.merge(cadastro);
			}
			// Finaliza a transa��o.
			entityManager.getTransaction().commit();
		} finally {
			entityManager.close();
		}
		return cadastro;
	}
	
	
	/**
	   * M�todo que apaga a cadastro do banco de dados.
	   * @param id
	   */
	  public void excluir(Long id) {
	    EntityManager entityManager = getEntityManager();
	    try {
	      // Inicia uma transa��o com o banco de dados.
	      entityManager.getTransaction().begin();
	      // Consulta a cadastro na base de dados atrav�s do seu ID.
	      Cadastro cadastro = entityManager.find(Cadastro.class, id);
	      System.out.println("Excluindo os dados de: " + cadastro.getNome());
	      // Remove a cadastro da base de dados.
	      entityManager.remove(cadastro);
	      // Finaliza a transa��o.
	      entityManager.getTransaction().commit();
	    } finally {
	      entityManager.close();
	    }
	  }

	  /**
	   * Consulta o cadastro pelo ID.
	   * @param id
	   * @return o objeto Cadastro.
	   */
	  public Cadastro consultarPorId(Long id) {
	    EntityManager entityManager = getEntityManager();
	    Cadastro cadastro = null;
	    try {
	      //Consulta uma cadastro pelo seu ID.
	      cadastro = entityManager.find(Cadastro.class, id);
	    } finally {
	      entityManager.close();
	    }
	    return cadastro;
	  }

}
