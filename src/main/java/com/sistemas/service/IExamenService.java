package com.sistemas.service;

import java.util.List;

import com.sistemas.model.Examen;

public interface IExamenService {
	
	Examen registrar(Examen examen);
	
	void modificar(Examen examen);
	
	void eliminar (int id);
	
	Examen listarID(int id);

	List<Examen> listar();

}
