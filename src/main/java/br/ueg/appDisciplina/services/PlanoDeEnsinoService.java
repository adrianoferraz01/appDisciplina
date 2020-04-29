package br.ueg.appDisciplina.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.appDisciplina.models.PlanoDeEnsino;
import br.ueg.appDisciplina.repositories.PlanoDeEnsinoRepository;

@Service
public class PlanoDeEnsinoService {
	
	@Autowired
	private final PlanoDeEnsinoRepository planoDeEnsinoRepository;
	
	public PlanoDeEnsinoService(PlanoDeEnsinoRepository planoDeEnsinoRepository) {
		this.planoDeEnsinoRepository = planoDeEnsinoRepository;
	}

	public PlanoDeEnsino savePlanoDeEnsino(PlanoDeEnsino planoDeEnsino) {
		return planoDeEnsinoRepository.save(planoDeEnsino);
	}
	
	public List<PlanoDeEnsino> listPlanosDeEnsino(){
		return planoDeEnsinoRepository.findAll();
	}
	
	public void deletePlanoDeEnsino(Long id) {
		planoDeEnsinoRepository.deleteById(id);
	}
	
	public Optional<PlanoDeEnsino> findPlanoDeEnsinoById(Long id){
		return planoDeEnsinoRepository.findById(id);
	}

}
