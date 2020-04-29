package br.ueg.appDisciplina.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.appDisciplina.models.PlanoDeEnsino;
import br.ueg.appDisciplina.models.Professor;
import br.ueg.appDisciplina.services.PlanoDeEnsinoService;
import br.ueg.appDisciplina.services.ProfessorService;

@RestController
public class PlanoDeEnsinoController {
	
	@Autowired
	private final PlanoDeEnsinoService planoDeEnsinoService;
	private final ProfessorService professorService;

	
	
	public PlanoDeEnsinoController(PlanoDeEnsinoService planoDeEnsinoService, ProfessorService professorService) {
		this.planoDeEnsinoService = planoDeEnsinoService;
		this.professorService = professorService;
	}

	@GetMapping("/planosDeEnsino")
	public List<PlanoDeEnsino> listPlanosDeEnsino(){
		return planoDeEnsinoService.listPlanosDeEnsino();
	}
	
	@PostMapping("/planosDeEnsino")
	public PlanoDeEnsino savePlanoDeEnsino(@RequestBody PlanoDeEnsino planoDeEnsino) {
		
		Optional<Professor> professor = professorService.findById(1L);
		planoDeEnsino.setProfessor(professor.get());
		
		return planoDeEnsinoService.savePlanoDeEnsino(planoDeEnsino);
	}
	
	@DeleteMapping("/planosDeEnsino/{id}")
	public void deletePlanoDeEnsinoById(@PathVariable Long id) {
		planoDeEnsinoService.deletePlanoDeEnsino(id);
	}
	
	@GetMapping("/planosDeEnsino/{id}")
	public PlanoDeEnsino findPlanoDeEnsinoById(@PathVariable Long id) {
		Optional<PlanoDeEnsino> optPlanoDeEnsino = planoDeEnsinoService
				.findPlanoDeEnsinoById(id);
		
		return optPlanoDeEnsino.get();
	}

}
