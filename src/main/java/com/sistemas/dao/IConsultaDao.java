package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.Consulta;

public interface IConsultaDao extends JpaRepository<Consulta,Integer> {

}
