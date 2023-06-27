package com.panvdev.apirest_prueba.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panvdev.apirest_prueba.modelos.User;
import com.panvdev.apirest_prueba.repositorios.UserRepositorio;


@Service
public class UserServicioImplementacion implements IUserServicios{

	@Autowired
	UserRepositorio userrepositorio;
	
	@Override
	public List<UserRepositorio> obtenertodo() {
		return userrepositorio.findAll();
	}

	@Override
	public User guardar(User user) {
		return userrepositorio.saveAll(user);
	}

	@Override
	public User obtenerPorId(int IdUser) {
		return (User) userrepositorio.findById(IdUser).orElse(null);
	}

	@Override
	public void eliminar(int IdUser) {
		userrepositorio.deleteById(IdUser);
	}
	
}
