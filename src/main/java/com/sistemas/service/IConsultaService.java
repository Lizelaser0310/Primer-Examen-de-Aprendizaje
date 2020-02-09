package com.sistemas.service;

import java.util.List;

import com.sistemas.model.Consulta;

public interface IConsultaService {
	
	Consulta registrar(Consulta consulta);
	
	void modificar(Consulta consulta);
	
	void eliminar (int id);
	
	Consulta listarID(int id);

	List<Consulta> listar();

}
