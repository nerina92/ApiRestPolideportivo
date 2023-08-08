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

import com.panvdev.apirest_prueba.modelos.Tipoevento;
import com.panvdev.apirest_prueba.repositorios.TipoeventoRepositorio;
import com.panvdev.apirest_prueba.servicios.TipoeventoServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class TipoeventoControlador {
	
	@Autowired
    TipoeventoServicioImplementacion tipoeventoservicio;
	
	
	@GetMapping("/tipoeventos")
	public List<Tipoevento> obtenertipoevento(){
		return tipoeventoservicio.obtenertodo();
	}
	
    @PostMapping("/guardarTipoeventos")
	public ResponseEntity<Tipoevento> guardarUsuario(@RequestBody Tipoevento tipoevento){
		Tipoevento nuevo_tipoevento = tipoeventoservicio.guardar(tipoevento);
		return new ResponseEntity<>(nuevo_tipoevento, HttpStatus.CREATED);
	}	
	
	@GetMapping("/tipoeventos/{id}")
	public ResponseEntity<Tipoevento> obtenerTipoeventoId(@PathVariable int id){
		Tipoevento tipoeventoPorId = tipoeventoservicio.obtenerPorId(id);
		return ResponseEntity.ok(tipoeventoPorId);
	}

	@PutMapping("/tipoeventos/{id}")
	public ResponseEntity<Tipoevento> actualizarTipoevento(@PathVariable int id, @RequestBody Tipoevento tipoevento){
		Tipoevento tipoeventoPorId = tipoeventoservicio.obtenerPorId(id);
		Tipoevento tipoevento_actualizado = tipoeventoservicio.guardar(tipoeventoPorId);
		return new ResponseEntity<>(tipoevento_actualizado, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/estados/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarTipoevento(@PathVariable int id) {
		this.tipoeventoservicio.eliminar(id);
		
		HashMap<String, Boolean> tipoeventoEliminado = new HashMap<>();
		tipoeventoEliminado.put("eliminado", true);
		return ResponseEntity.ok(tipoeventoEliminado);
	}
	
}