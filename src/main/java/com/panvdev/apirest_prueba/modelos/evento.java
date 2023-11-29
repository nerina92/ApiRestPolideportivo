package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evento implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaFin;
	private Boolean finesLucro; 
    private int tipo;
    private int estado;
    private int userId;

	
	public Evento() {
		
	}
	
	public Evento(int id, String nombre, String descripcion, Date fechaInicio, Date fechaFin, Boolean finesLucro, int tipo, int estado, int userId) {
		this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.finesLucro=finesLucro;
        this.tipo=tipo;
        this.estado=estado;
        this.userId=userId;
        
	}

	public int getid() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String setNombre(String nombre) {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String setDescripcion(String descripcion) {
		return descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public Date setFechaInicio(Date fechaInicio) {
		return fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public Date setFechaFin(Date fechaFin) {
		return fechaFin;
	}

	public Boolean getFinesLucro() {
		return finesLucro;
	}

	public Boolean setfinesLucro (Boolean finesLucro) {
		return finesLucro;
	}
	
	public int getTipo() {
		return tipo;
	}

	public int setTipo(int tipo) {
		return tipo;
	}

public int getEstado() {
		return estado;
	}

	public int setEstado(int estado) {
		return estado;
	}

public int getUserId() {
		return userId;
	}

	public int setUserId(int euserId) {
		return userId;
	}

}
