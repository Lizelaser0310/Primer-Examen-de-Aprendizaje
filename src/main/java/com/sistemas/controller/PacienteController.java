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

import com.sistemas.model.Paciente;
import com.sistemas.service.IPacienteService;

@RestController
@RequestMapping(value = "/api/paciente")
public class PacienteController {
	
	   @Autowired
	   private IPacienteService service;
	
	   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Paciente>> listar() {

	        List<Paciente> pacientes = new ArrayList<>();
	        pacientes = service.listar();

	        return new ResponseEntity<>(pacientes, HttpStatus.OK);
	    }
	    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> registrar(@Valid @RequestBody Paciente pacientes) {
	        service.registrar(pacientes);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

	    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> actualizar(@RequestBody Paciente pacientes) {
	        service.modificar(pacientes);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

}
