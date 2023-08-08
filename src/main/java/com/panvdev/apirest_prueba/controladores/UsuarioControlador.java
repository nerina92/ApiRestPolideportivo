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

import com.panvdev.apirest_prueba.modelos.User;
import com.panvdev.apirest_prueba.repositorios.UserRepositorio;
import com.panvdev.apirest_prueba.servicios.UserServicioImplementacion;

@RestController
@RequestMapping("/api/v1")
public class UsuarioControlador {
	
	@Autowired
	UserServicioImplementacion usuarioservicio;
	
	
	@GetMapping("/usuarios")
	public List<User> obtenerUsuarios(){
		return usuarioservicio.obtenertodo();
	}
	
	
	@PostMapping("/guardarUsuario")
	public ResponseEntity<User> guardarUsuario(@RequestBody User user){
		User nuevo_usuario = usuarioservicio.guardar(user);
		return new ResponseEntity<>(nuevo_usuario, HttpStatus.CREATED);
	}	
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<User> obtenerUsuarioId(@PathVariable int id){
		User usuarioPorId = usuarioservicio.obtenerPorId(id);
		return ResponseEntity.ok(usuarioPorId);
	}
	
	@PutMapping("/usuario/{id}")
	public ResponseEntity<User> actualizarUsuario(@PathVariable int id, @RequestBody User usuario){
		User usuarioPorId = usuarioservicio.obtenerPorId(id);
		usuarioPorId.setNombre(usuario.getNombre());
		usuarioPorId.setApellido(usuario.getApellido());
		usuarioPorId.setEmail(usuario.getEmail());
		
		User usuario_actualizado = usuarioservicio.guardar(usuarioPorId);
		return new ResponseEntity<>(usuario_actualizado, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity<HashMap<String,Boolean>> eliminarUsuario(@PathVariable int id) {
		this.usuarioservicio.eliminar(id);
		
		HashMap<String, Boolean> estadoUsuarioEliminado = new HashMap<>();
		estadoUsuarioEliminado.put("eliminado", true);
		return ResponseEntity.ok(estadoUsuarioEliminado);
	}
	
	
	
	
}
