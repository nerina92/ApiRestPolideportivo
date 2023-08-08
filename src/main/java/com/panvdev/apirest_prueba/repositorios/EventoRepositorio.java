package com.panvdev.apirest_prueba.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.panvdev.apirest_prueba.modelos.Evento;

@Repository
public interface EventoRepositorio extends JpaRepository<Evento, Integer> {

}
