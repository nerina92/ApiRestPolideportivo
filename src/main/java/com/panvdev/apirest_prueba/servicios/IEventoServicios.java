package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import com.panvdev.apirest_prueba.modelos.Evento;


public interface IEventoServicios {
	
	public List<Evento> obtenertodo();
	
	public Evento guardar (Evento evento);
	
	public Evento obtenerPorId (int Id);
	
	public void eliminar (int Id);
 
}