package br.ueg.appDisciplina.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PlanoDeEnsino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String curso;
	private String modalidade;
	private String semestre;
	private String disciplina;
	private String periodo;
	private int cargaHorariaNAS;
	private int cargaHorariaTAS;
	private int cargaHorariaCHT;
	private int cargaHorariaPBO;
	private String ementa;
	
	@ManyToOne
	@JsonIgnore
	private Professor professor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public int getCargaHorariaNAS() {
		return cargaHorariaNAS;
	}
	public void setCargaHorariaNAS(int cargaHorariaNAS) {
		this.cargaHorariaNAS = cargaHorariaNAS;
	}
	public int getCargaHorariaTAS() {
		return cargaHorariaTAS;
	}
	public void setCargaHorariaTAS(int cargaHorariaTAS) {
		this.cargaHorariaTAS = cargaHorariaTAS;
	}
	public int getCargaHorariaCHT() {
		return cargaHorariaCHT;
	}
	public void setCargaHorariaCHT(int cargaHorariaCHT) {
		this.cargaHorariaCHT = cargaHorariaCHT;
	}
	public int getCargaHorariaPBO() {
		return cargaHorariaPBO;
	}
	public void setCargaHorariaPBO(int cargaHorariaPBO) {
		this.cargaHorariaPBO = cargaHorariaPBO;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
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
		PlanoDeEnsino other = (PlanoDeEnsino) obj;
		if (id != other.id)
			return false;
		return true;
	}

	

}
