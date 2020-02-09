package com.sistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.dao.IConsultaDao;
import com.sistemas.model.Consulta;


@Service
public class ConsultaServiceImpl implements IConsultaService {

	@Autowired
	private IConsultaDao dao;
	
	@Override
	public Consulta registrar(Consulta consulta) {
		// TODO Auto-generated method stub
		return dao.save(consulta);
	}

	@Override
	public void modificar(Consulta consulta) {
		// TODO Auto-generated method stub
		dao.save(consulta);

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);

	}

	@Override
	public Consulta listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Consulta> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
