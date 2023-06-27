package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import com.panvdev.apirest_prueba.modelos.User;
import com.panvdev.apirest_prueba.repositorios.UserRepositorio;


public interface IUserServicios {
	
	public List<UserRepositorio> obtenertodo();
	
	public User guardar (User user);
	
	public User obtenerPorId (int IdUser);
	
	public void eliminar (int IdUser);
 
}