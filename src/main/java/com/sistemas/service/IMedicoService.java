package com.sistemas.service;

import java.util.List;

import com.sistemas.model.Medico;

public interface IMedicoService {
	
	Medico registrar(Medico medico);
	
	void modificar(Medico medico);
	
	void eliminar (int id);
	
	Medico listarID(int id);

	List<Medico> listar();


}
