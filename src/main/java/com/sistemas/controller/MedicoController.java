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

import com.sistemas.model.Medico;
import com.sistemas.service.IMedicoService;


@RestController
@RequestMapping(value = "/api/medico")
public class MedicoController {
	
	   @Autowired
	   private IMedicoService service;
	
	   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Medico>> listar() {

	        List<Medico> medicos = new ArrayList<>();
	        medicos = service.listar();

	        return new ResponseEntity<>(medicos, HttpStatus.OK);
	    }
	    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> registrar(@Valid @RequestBody Medico medicos) {
	        service.registrar(medicos);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

	    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> actualizar(@RequestBody Medico medicos) {
	        service.modificar(medicos);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

}
