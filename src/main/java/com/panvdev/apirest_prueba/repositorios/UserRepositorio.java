package com.panvdev.apirest_prueba.repositorios;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepositorio extends JpaRepository<UserRepositorio, Integer> {
	@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idusers;
	private String nombre;
	private String apellido;
	private String dni;
	private String email;
	private String password; 
	
	public void UserRepositorio() {
		
	}
	
	public void UserRepositorio(int idUsers, String nombre, String apellido, String dni, String email, String password) {
		this.idusers = idUsers;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.password = password;
	}

	public int getIdusers() {
		return idusers;
	}

	/*public void setIdusers(int idUsers) {
		this.idusers = idUsers;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}

    public com.panvdev.apirest_prueba.modelos.User saveAll(com.panvdev.apirest_prueba.modelos.User user);

}
