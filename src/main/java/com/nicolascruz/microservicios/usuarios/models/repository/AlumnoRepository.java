package com.nicolascruz.microservicios.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.nicolascruz.microservicios.usuarios.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	
	
}
