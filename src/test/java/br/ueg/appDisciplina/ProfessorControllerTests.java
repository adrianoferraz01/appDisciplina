package br.ueg.appDisciplina;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import br.ueg.appDisciplina.models.Professor;
import br.ueg.appDisciplina.services.ProfessorService;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ProfessorControllerTests {
	
	 @LocalServerPort
	 private int port;
	
	 @MockBean
	 private ProfessorService professorService;
	 
	 @Autowired
	 private TestRestTemplate testRestTemplate;
	 
	 	@Test
	    public void getListProfessoresDeveRetornar200() throws Exception {
	    	
	    	List<Professor> professores = new ArrayList<>();
	    	professores.add(new Professor(1L, "adriano"));
	    	professores.add(new Professor(2L, "edmar"));
	    	
	    	BDDMockito.when(professorService.listProfessor()).thenReturn(professores);

	        ResponseEntity<String> response = testRestTemplate.getForEntity(
				new URL("http://localhost:" + port + "/professores").toString(), String.class);
	        assertEquals(200, response.getStatusCodeValue());
	    }
	 	
	 	 @Test
	     public void getProfessorByIdDeveRetornar200() throws Exception {
	     	
	     	Professor professor = new Professor(1L, "adriano");
	     	
	     	BDDMockito.when(professorService.findById(professor.getId())).thenReturn(professor);

	         ResponseEntity<String> response = testRestTemplate.getForEntity(
	 			new URL("http://localhost:" + port + "/professores/{id}")
	 								.toString(), String.class, professor.getId());
	         assertEquals(200, response.getStatusCodeValue());

	     }

}
