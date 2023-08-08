package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panvdev.apirest_prueba.modelos.Evento;
import com.panvdev.apirest_prueba.repositorios.EventoRepositorio;


@Service
public class EventoServicioImplementacion implements IEventoServicios{

	@Autowired
	EventoRepositorio eventoRepositorio;
	
	@Override
	public List<Evento> obtenertodo() {
		return eventoRepositorio.findAll();
	}

	@Override
	public Evento guardar(Evento evento) {
		return eventoRepositorio.save(evento);
	}

	@Override
	public Evento obtenerPorId(int Id) {
		return eventoRepositorio.findById(Id).orElse(null);
	}

	@Override
	public void eliminar(int Id) {
		eventoRepositorio.deleteById(Id);
	}

}
