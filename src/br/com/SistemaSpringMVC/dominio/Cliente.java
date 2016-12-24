package br.com.SistemaSpringMVC.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(generator = "Cliente_ID", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "Cliente_ID", sequenceName = "Seq_Cliente", allocationSize = 1)
	private Long ID;
	private String email;
	private String nome;
	private String cpf;
	private String endereco;

	public Cliente() {
		super();
	}

	public Cliente(String email, String nome, String cpf, String endereco) {
		this.email = email;
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public long getId(){
		return ID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
