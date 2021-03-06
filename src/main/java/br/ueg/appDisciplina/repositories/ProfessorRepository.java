package br.ueg.appDisciplina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ueg.appDisciplina.models.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{
	

}
