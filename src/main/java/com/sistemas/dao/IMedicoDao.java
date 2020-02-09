package com.sistemas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemas.model.Medico;

public interface IMedicoDao extends JpaRepository<Medico,Integer> {

}
