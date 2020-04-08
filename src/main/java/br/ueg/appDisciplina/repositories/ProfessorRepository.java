package br.ueg.appDisciplina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ueg.appDisciplina.models.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}
