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

import com.sistemas.model.Consulta;
import com.sistemas.service.IConsultaService;

@RestController
@RequestMapping(value = "/api/consulta")
public class ConsultaController {
	
	   @Autowired
	   private IConsultaService service;
	
	   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<Consulta>> listar() {

	        List<Consulta> consultas = new ArrayList<>();
	        consultas = service.listar();

	        return new ResponseEntity<>(consultas, HttpStatus.OK);
	    }
	    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> registrar(@Valid @RequestBody Consulta consultas) {
	        service.registrar(consultas);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

	    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> actualizar(@RequestBody Consulta consultas) {
	        service.modificar(consultas);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }	

}
