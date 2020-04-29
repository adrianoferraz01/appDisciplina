package br.ueg.appDisciplina.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ueg.appDisciplina.models.Professor;
import br.ueg.appDisciplina.repositories.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private final ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}
	
	public Professor saveProfessor(Professor professor) {
		return professorRepository.save(professor);
	}
	
	public List<Professor> listProfessor() {
		return professorRepository.findAll();
	}
	
	public void deleteProfessor(Long id) {
		professorRepository.deleteById(id);
	}
	
	public Professor findById(Long id) {
		Optional<Professor> optProfessor = professorRepository.findById(id);
		return optProfessor.get();
	}
}
