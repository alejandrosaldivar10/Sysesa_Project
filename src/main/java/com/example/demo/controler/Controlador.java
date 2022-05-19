package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfaceService.IclienteService;
import com.example.demo.modelo.Cliente;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IclienteService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Cliente>clientes=service.listar();
		model.addAttribute("clientes", clientes);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("cliente", new Cliente());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Cliente c, Model model) {
		service.save(c);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Cliente>cliente=service.listarId(id);
		model.addAttribute("cliente", cliente);
		return "form";
	}
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model,@PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	} 
		
	}

