package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import com.panvdev.apirest_prueba.modelos.Estado;


public interface IEstadoServicios {
	
	public List<Estado> obtenertodo();
	
	public Estado guardar (Estado estado);
	
	public Estado obtenerPorId (int Id);
	
	public void eliminar (int Id);
 
}