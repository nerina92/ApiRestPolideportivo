package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panvdev.apirest_prueba.modelos.Tipoevento;
import com.panvdev.apirest_prueba.repositorios.TipoeventoRepositorio;

@Service
public class TipoeventoServicioImplementacion implements ITipoeventoServicios{

	@Autowired
	TipoeventoRepositorio tipoeventoRepositorio;
	
	@Override
	public List<Tipoevento> obtenertodo() {
		return tipoeventoRepositorio.findAll();
	}

	@Override
	public Tipoevento guardar(Tipoevento tipoevento) {
		return tipoeventoRepositorio.save(tipoevento);
	}

	@Override
	public Tipoevento obtenerPorId(int Id) {
		return tipoeventoRepositorio.findById(Id).orElse(null);
	}

	@Override
	public void eliminar(int Id) {
		tipoeventoRepositorio.deleteById(Id);
	}

}
