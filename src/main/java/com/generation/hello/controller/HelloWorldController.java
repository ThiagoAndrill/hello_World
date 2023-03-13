package com.generation.hello.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/bsm")
	public List<String> bsm() {
	ArrayList<String> bsm = new ArrayList<String>();
	
	bsm.add("Responsabilidade pessoal");
	bsm.add("Mentalidade de crescimento");
	bsm.add("Orientação ao futuro");
	bsm.add("Persistência");
	bsm.add("Comunicação");
	bsm.add("Orientação aos detalhes");
	bsm.add("Trabalho em equipe");
	bsm.add("Proatividade");
	
	return bsm;
	}
	
	@GetMapping("/objetivos")
	public List<String> objetivos() {
	ArrayList<String> objetivos = new ArrayList<String>();
		
	objetivos.add("Aprender o conteudo");
	objetivos.add("Não precisar de ajuda para concluir os exercícios");
	objetivos.add("Confiar no processo");
	
	return objetivos;
	}
}
