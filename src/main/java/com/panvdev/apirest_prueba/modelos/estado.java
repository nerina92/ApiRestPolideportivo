package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String tipo;

	
	public Estado() {
		
	}
	
	public Estado(int id, String tipo) {
		this.id=id;
        this.tipo=tipo;
        
	}

	public int getid() {
		return id;
	}


	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		 this.tipo=tipo;
	}

}
