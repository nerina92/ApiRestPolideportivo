package com.panvdev.apirest_prueba.modelos;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

@Entity
public class evento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private VarcharTypeDescriptor nombre;
	private VarcharTypeDescriptor descripcion;
	private int fechaInicio;
	private int fechaFin;
	private TinyIntTypeDescriptor fechaLucro; 
    private int tipo;
    private int estado;
    private int userId;

	
	public evento() {
		
	}
	
	public evento(int id, VarcharTypeDescriptor nombre, VarcharTypeDescriptor descripcion, int fechaInicio, int fechaFin, TinyIntTypeDescriptor fechaLucro, int tipo, int estado, int userId) {
		this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.fechaInicio=fechaInicio;
        this.fechaFin=fechaFin;
        this.fechaLucro=fechaLucro;
        this.tipo=tipo;
        this.estado=estado;
        this.userId=userId;
        
	}

	public int getid() {
		return id;
	}

	public int setId(int id) {
		return id;
	}

	public VarcharTypeDescriptor getNombre() {
		return nombre;
	}

	public VarcharTypeDescriptor setNombre(VarcharTypeDescriptor nombre) {
		return nombre;
	}

	public VarcharTypeDescriptor getDescripcion() {
		return descripcion;
	}

	public VarcharTypeDescriptor setDescripcion(VarcharTypeDescriptor descripcion) {
		return descripcion;
	}

	public int getFechaInicio() {
		return fechaInicio;
	}

	public int setFechaInicio(int fechaInicio) {
		return fechaInicio;
	}

	public int getFechaFin() {
		return fechaFin;
	}

	public int setFechaFin(int fechaFin) {
		return fechaFin;
	}

	public TinyIntTypeDescriptor getFechaLucro() {
		return fechaLucro;
	}

	public TinyIntTypeDescriptor setFechaLucro (TinyIntTypeDescriptor fechaLucro) {
		return fechaLucro;
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
