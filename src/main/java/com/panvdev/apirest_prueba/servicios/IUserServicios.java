package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import com.panvdev.apirest_prueba.modelos.User;


public interface IUserServicios {
	
	public List<User> obtenertodo();
	
	public User guardar (User user);
	
	public User obtenerPorId (long IdUser);
	
	public void eliminar (long IdUser);
 
}