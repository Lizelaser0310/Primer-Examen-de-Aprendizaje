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

import com.sistemas.model.DetalleConsulta;
import com.sistemas.service.IDetalleConsultaService;

@RestController
@RequestMapping(value = "/api/detalle")
public class DetalleConsultaController {
	
	   @Autowired
	   private IDetalleConsultaService service;
	
	   @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<DetalleConsulta>> listar() {

	        List<DetalleConsulta> detalles = new ArrayList<>();
	        detalles = service.listar();

	        return new ResponseEntity<>(detalles, HttpStatus.OK);
	    }
	    @PostMapping(value = "/registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> registrar(@Valid @RequestBody DetalleConsulta detalles) {
	        service.registrar(detalles);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

	    @PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Object> actualizar(@RequestBody DetalleConsulta detalles) {
	        service.modificar(detalles);
	        return new ResponseEntity<Object>(HttpStatus.OK);
	    }

}
