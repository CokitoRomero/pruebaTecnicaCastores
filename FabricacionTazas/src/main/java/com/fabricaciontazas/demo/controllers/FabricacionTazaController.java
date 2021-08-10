package com.fabricaciontazas.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabricaciontazas.demo.models.entity.Taza;
import com.fabricaciontazas.demo.services.FabricacionTazaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge= 3600)
@RestController
@RequestMapping("/tazas")
public class FabricacionTazaController {

	@Autowired
	private FabricacionTazaService tazaServiceImpl;

	
	@GetMapping
	@RequestMapping(value="consultarTazas", method= RequestMethod.GET)
	public ResponseEntity<List<Taza>> consultarTazas()
	{
		
		List<Taza> resultadoTazas = this.tazaServiceImpl.consultarTazas();
		
		return ResponseEntity.ok(resultadoTazas);
	}
	
	
	@PostMapping
	@RequestMapping(value="agregarTazas", method= RequestMethod.POST)
	public ResponseEntity<Taza> guardarTazas(@RequestBody Taza taza)
	{
		Taza tazaGuardar = this.tazaServiceImpl.guardarTaza(taza);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(tazaGuardar);
		
	}
	
	@PostMapping
	public Taza agregarTazas(@RequestBody Taza taza)
	{
		return this.tazaServiceImpl.agregarTazas(taza);
	}

	@PutMapping
	@RequestMapping(value="modificarTazas", method= RequestMethod.PUT)
	public ResponseEntity<Taza> modificarTazas(@RequestBody Taza taza)
	{
		Taza tazaActualizar = this.tazaServiceImpl.guardarTaza(taza);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(tazaActualizar);
	}
	
	
	@DeleteMapping
	@RequestMapping(value="eliminarTaza/{id}", method= RequestMethod.DELETE)
	public ResponseEntity<Taza> eliminarTaza(@PathVariable Long id)
	{
		 this.tazaServiceImpl.eliminarTaza(id);
		
		 return ResponseEntity.ok().build();
	}
	
	@GetMapping(path= {"/{id}"})
	public Optional<Taza> buscarId(@PathVariable("id")long id) {
		return this.tazaServiceImpl.buscarTaza(id);
	}
	
	@PutMapping
	public Taza actualizarTazas(@RequestBody Taza taza, @PathVariable("id") long id)
	{
		taza.setId(id);
		
		return this.tazaServiceImpl.actualizarTaza(taza);
	}

	
	
}
