package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.DetalleConsulta;

public interface IDetalleConsultaDao extends JpaRepository<DetalleConsulta,Integer> {

}
