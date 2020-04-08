package br.ueg.appDisciplina.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.ueg.appDisciplina.models.Professor;
import br.ueg.appDisciplina.services.ProfessorService;

@RestController
public class ProfessorController {
	
	@Autowired
	private final ProfessorService professorService;
	
	public ProfessorController(ProfessorService professorService) {
		this.professorService = professorService;
	}

	@GetMapping("/professores")
	public List<Professor> listProfessor(){
		return professorService.listProfessor();
	}
	
	@PostMapping("/professores")
	public Professor saveProfessor(@RequestBody Professor professor) {
		return professorService.saveProfessor(professor);
	}
	
	@DeleteMapping("/professores/{id}")
	public void deleteProfessor(@PathVariable(value = "id") Long id) {
		professorService.deleteProfessor(id);
	}
}
