package br.ueg.appDisciplina.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	private String email;
	private String celular;
	
	@OneToMany(mappedBy = "professor")
	private List<PlanoDeEnsino> planoDeEnsino;

	public Professor() {
	}
	
	public Professor(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}


	//Inserir métodos get e set para todos os campos.
	//Inserir métodos equals e hashCode para id.
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	
	public List<PlanoDeEnsino> getPlanoDeEnsino() {
		return planoDeEnsino;
	}
	public void setPlanoDeEnsino(List<PlanoDeEnsino> planoDeEnsino) {
		this.planoDeEnsino = planoDeEnsino;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
}
