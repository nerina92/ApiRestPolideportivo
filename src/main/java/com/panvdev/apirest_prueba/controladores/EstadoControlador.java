package com.panvdev.apirest_prueba.controladores;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panvdev.apirest_prueba.modelos.Estado;
import com.panvdev.apirest_prueba.servicios.EstadoServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class EstadoControlador {
	
	@Autowired
    EstadoServicioImplementacion estadoservicio;
	
	
	@GetMapping("/estados")
	public List<Estado> obtenerEstados(){
		return estadoservicio.obtenertodo();
	}
	
    @PostMapping("/guardarEstados")
	public ResponseEntity<Estado> guardarUsuario(@RequestBody Estado estado){
		Estado nuevo_estado = estadoservicio.guardar(estado);
		return new ResponseEntity<>(nuevo_estado, HttpStatus.CREATED);
	}	
	
	@GetMapping("/estados/{id}")
	public ResponseEntity<Estado> obtenerEstadoId(@PathVariable int id){
		Estado estadoPorId = estadoservicio.obtenerPorId(id);
		return ResponseEntity.ok(estadoPorId);
	}

	@PutMapping("/estados/{id}")
	public ResponseEntity<Estado> actualizarEstado(@PathVariable int id, @RequestBody Estado estado){
		Estado estadoPorId = estadoservicio.obtenerPorId(id);
		Estado estado_actualizado = estadoservicio.guardar(estadoPorId);
		return new ResponseEntity<>(estado_actualizado, HttpStatus.CREATED);
	}
	
/* 	@DeleteMapping("/estados/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarEstado(@PathVariable int id) {
		this.estadoservicio.eliminar(id);
		
		HashMap<String, Boolean> estadoEliminado = new HashMap<>();
		estadoEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoEliminado);
	}*/
	
}