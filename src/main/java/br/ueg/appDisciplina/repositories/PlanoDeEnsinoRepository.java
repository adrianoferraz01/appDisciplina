package br.ueg.appDisciplina.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ueg.appDisciplina.models.PlanoDeEnsino;

@Repository
public interface PlanoDeEnsinoRepository extends JpaRepository<PlanoDeEnsino, Long>{

}
