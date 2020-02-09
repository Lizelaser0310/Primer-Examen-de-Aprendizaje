package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.Paciente;


public interface IPacienteDao extends JpaRepository<Paciente,Integer> {

}
