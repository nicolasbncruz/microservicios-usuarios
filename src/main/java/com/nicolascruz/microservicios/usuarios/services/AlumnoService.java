package com.nicolascruz.microservicios.usuarios.services;

import java.util.Optional;

import com.nicolascruz.microservicios.usuarios.models.entity.Alumno;

public interface AlumnoService {
	
	public Iterable<Alumno> findAll();
	
	public Optional<Alumno> findById(Long id);
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);

}
