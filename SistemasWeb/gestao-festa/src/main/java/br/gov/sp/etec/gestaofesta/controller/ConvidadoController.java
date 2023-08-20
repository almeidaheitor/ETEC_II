package br.gov.sp.etec.gestaofesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.gov.sp.etec.gestaofesta.model.Convidado;
import br.gov.sp.etec.gestaofesta.repository.ConvidadoRepository;


@Controller
public class ConvidadoController {
	
	@Autowired
	ConvidadoRepository repository;
	
	@GetMapping("ola-mundo")
	
	public String olaMundo(){
		return "ola";
	}
	
	@GetMapping("formConvidado")
	public String formulario(){
		return "formConvidado";
	}
	
	@PostMapping("salvar-convidado")
	public String salvarConvidado(Convidado com){
		repository.save(com);
		return "formConvidado";
	}
	
	
}
