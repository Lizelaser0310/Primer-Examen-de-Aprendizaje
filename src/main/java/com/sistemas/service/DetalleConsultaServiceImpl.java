package com.sistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.dao.IDetalleConsultaDao;
import com.sistemas.model.DetalleConsulta;

@Service
public class DetalleConsultaServiceImpl implements IDetalleConsultaService {
	
	@Autowired
	private IDetalleConsultaDao dao;

	@Override
	public DetalleConsulta registrar(DetalleConsulta detalle) {
		// TODO Auto-generated method stub
		return dao.save(detalle);
	}

	@Override
	public void modificar(DetalleConsulta detalle) {
		// TODO Auto-generated method stub
		dao.save(detalle);

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);

	}

	@Override
	public DetalleConsulta listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<DetalleConsulta> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
