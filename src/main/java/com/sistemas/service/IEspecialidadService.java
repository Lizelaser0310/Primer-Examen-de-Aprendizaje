package com.sistemas.service;

import java.util.List;

import com.sistemas.model.Especialidad;

public interface IEspecialidadService {
	
	Especialidad registrar(Especialidad especialidad);
	
	void modificar(Especialidad especialidad);
	
	void eliminar (int id);
	
	Especialidad listarID(int id);

	List<Especialidad> listar();

}
