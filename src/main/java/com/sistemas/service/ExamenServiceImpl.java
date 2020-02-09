package com.sistemas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemas.dao.IExamenDao;
import com.sistemas.model.Examen;

@Service
public class ExamenServiceImpl implements IExamenService {
	
	@Autowired
	private IExamenDao dao;

	@Override
	public Examen registrar(Examen examen) {
		// TODO Auto-generated method stub
		return dao.save(examen);
	}

	@Override
	public void modificar(Examen examen) {
		// TODO Auto-generated method stub
		dao.save(examen);

	}

	@Override
	public void eliminar(int id) {
		// TODO Auto-generated method stub
		dao.deleteById(id);

	}

	@Override
	public Examen listarID(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public List<Examen> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
