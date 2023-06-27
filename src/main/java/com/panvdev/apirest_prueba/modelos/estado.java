package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class estado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private int tipo;

	
	public estado() {
		
	}
	
	public estado(int id, int tipo) {
		this.id=id;
        this.tipo=tipo;
        
	}

	public int getid() {
		return id;
	}

	public int setId(int id) {
		return id;
	}

	public int getTipo() {
		return tipo;
	}

	public int setTipo(int tipo) {
		return tipo;
	}

}
