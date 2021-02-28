package com.valdir.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.todo.domain.Todo;
import com.valdir.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;
 
	public void instanciaBaseDeDados() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", sdf.parse("25/03/2022"), false);
		Todo t2 = new Todo(null, "Ler", "Ler livro de desenvolvimento pessoal", sdf.parse("22/03/2021"), true);
		Todo t3 = new Todo(null, "Exercicios", "Praticar exercicios fisicos", sdf.parse("21/03/2022"), false);
		Todo t4 = new Todo(null, "Meditar", "Meditar durante 30 minutos pela manhã", sdf.parse("27/03/2021"), false);
		Todo t5 = new Todo(null, "Correr", "Correr 20 kilometros ", sdf.parse("27/09/2021"), false);
		Todo t6 = new Todo(null, "Trabalho", "Trabalho da faculdade para apresentar", sdf.parse("27/05/2021"), false);
	    

		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5, t6));
	} 
	
}
 