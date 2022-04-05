package com.nicolascruz.microservicios.usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nicolascruz.microservicios.usuarios.models.entity.Alumno;
import com.nicolascruz.microservicios.usuarios.services.AlumnoService;

@RestController
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> ver(@PathVariable(name = "id") Long id){
		Optional<Alumno> optional = service.findById(id);
		if(optional.isEmpty()) {
			ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optional.get());
		
	}
	

}
