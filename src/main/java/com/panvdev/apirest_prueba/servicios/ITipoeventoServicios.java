package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import com.panvdev.apirest_prueba.modelos.Tipoevento;


public interface ITipoeventoServicios {
	
	public List<Tipoevento> obtenertodo();
	
	public Tipoevento guardar (Tipoevento tipoevento);
	
	public Tipoevento obtenerPorId (int Id);
	
	public void eliminar (int Id);
 
}