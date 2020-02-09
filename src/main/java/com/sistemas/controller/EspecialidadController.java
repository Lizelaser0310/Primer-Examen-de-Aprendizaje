package com.sistemas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemas.model.Especialidad;
import com.sistemas.service.IEspecialidadService;

@RestController
@RequestMapping(value = "/api/especialidad")
public class EspecialidadController {
	
	   @Autowired
	   private IEspecialidadService service;
	
	   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Especialidad>> listar() {

	        List<Especialidad> especialidades = new ArrayList<>();
	        especialidades = service.listar();

	        return new ResponseEntity<>(especialidades, HttpStatus.OK);
	    }
	    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> registrar(@Valid @RequestBody Especialidad especialidades) {
	        service.registrar(especialidades);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

	    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> actualizar(@RequestBody Especialidad especialidades) {
	        service.modificar(especialidades);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

}
