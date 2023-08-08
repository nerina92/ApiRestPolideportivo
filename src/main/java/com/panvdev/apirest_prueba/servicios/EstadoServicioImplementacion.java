package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panvdev.apirest_prueba.modelos.Estado;
import com.panvdev.apirest_prueba.repositorios.EstadoRepositorio;


@Service
public class EstadoServicioImplementacion implements IEstadoServicios{

	@Autowired
	EstadoRepositorio estadoRepositorio;
	
	@Override
	public List<Estado> obtenertodo() {
		return estadoRepositorio.findAll();
	}

	@Override
	public Estado guardar(Estado estado) {
		return estadoRepositorio.save(estado);
	}

	@Override
	public Estado obtenerPorId(int Id) {
		return estadoRepositorio.findById(Id).orElse(null);
	}

	@Override
	public void eliminar(int Id) {
		estadoRepositorio.deleteById(Id);
	}

}
