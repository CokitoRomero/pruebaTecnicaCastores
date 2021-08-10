package com.fabricaciontazas.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fabricaciontazas.demo.models.entity.Pedido;
import com.fabricaciontazas.demo.services.PedidoTazaService;

@CrossOrigin(origins = "http://localhost:4200", maxAge= 3600)
@RestController
@RequestMapping("/pedido")
public class PedidoTazaController {

	@Autowired
	private PedidoTazaService pedidoServiceImpl; 
	
	
	@PostMapping
	@RequestMapping(value="guardarPedido", method= RequestMethod.POST)
	public ResponseEntity<Pedido> guardarPedido(@RequestBody Pedido pedido)
	{
		Pedido pedidoGuardar = this.pedidoServiceImpl.guardarPedido(pedido);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoGuardar);
		
	}
	
	@PostMapping
	public Pedido agregarPedido(@RequestBody Pedido pedido)
	{
		return this.pedidoServiceImpl.agregarPedido(pedido);
	}
}
