package br.edu.ifsp.circulosolidario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.circulosolidario.repository.DoadorRepository;

@CrossOrigin
@SpringBootApplication
@RestController
public class CirculosolidarioApplication {

	public static void main(String[] args) {
		DoadorRepository.init();
		SpringApplication.run(CirculosolidarioApplication.class, args);

	}

}
