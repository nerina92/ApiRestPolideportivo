package com.panvdev.apirest_prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panvdev.apirest_prueba.modelos.Tipoevento;

@Repository
public interface TipoeventoRepositorio extends JpaRepository<Tipoevento, Integer> {

}
