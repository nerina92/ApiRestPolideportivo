package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tipoevento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private int nombre;
	
	public tipoevento() {
		
	}
	
	public tipoevento(int id, int nombre) {
		this.id=id;
        this.nombre=nombre;
        
	}

	public int getid() {
		return id;
	}

	public int setId(int id) {
		return id;
	}

	public int getNombre() {
		return nombre;
	}

	public int setNombre(int nombre) {
		return nombre;
	}

}