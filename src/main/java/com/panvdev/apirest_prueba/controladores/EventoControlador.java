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

import com.panvdev.apirest_prueba.modelos.Evento;
import com.panvdev.apirest_prueba.servicios.EventoServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class EventoControlador {
	
	@Autowired
    EventoServicioImplementacion eventoservicio;
	
	
	@GetMapping("/eventos")
	public List<Evento> obtenerEventos(){
		return eventoservicio.obtenertodo();
	}
	
    @PostMapping("/guardarEvento")
	public ResponseEntity<Evento> guardarUsuario(@RequestBody Evento evento){
		Evento nuevo_evento = eventoservicio.guardar(evento);
		return new ResponseEntity<>(nuevo_evento, HttpStatus.CREATED);
	}	
	
	@GetMapping("/eventos/{id}")
	public ResponseEntity<Evento> obtenerEventoId(@PathVariable int id){
		Evento EventoPorId = eventoservicio.obtenerPorId(id);
		return ResponseEntity.ok(EventoPorId);
	}

	@PutMapping("/eventos/{id}")
	public ResponseEntity<Evento> actualizarEstado(@PathVariable int id, @RequestBody Evento evento){
		Evento eventoPorId = eventoservicio.obtenerPorId(id);
		Evento evento_actualizado = eventoservicio.guardar(eventoPorId);
		return new ResponseEntity<>(evento_actualizado, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/eventos/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarEvento(@PathVariable int id) {
		this.eventoservicio.eliminar(id);
		
		HashMap<String, Boolean> EventoEliminado = new HashMap<>();
		EventoEliminado.put("eliminado", true);
		return ResponseEntity.ok(EventoEliminado);
	}
	
}