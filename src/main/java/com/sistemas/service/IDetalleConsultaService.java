package com.sistemas.service;

import java.util.List;

import com.sistemas.model.DetalleConsulta;

public interface IDetalleConsultaService {
	
	DetalleConsulta registrar(DetalleConsulta detalle);
	
	void modificar(DetalleConsulta detalle);
	
	void eliminar (int id);
	
	DetalleConsulta listarID(int id);

	List<DetalleConsulta> listar();

}
