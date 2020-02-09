package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.Examen;

public interface IExamenDao extends JpaRepository<Examen,Integer> {

}
