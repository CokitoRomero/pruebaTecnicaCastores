package com.fabricaciontazas.demo.services;

import java.util.List;
import java.util.Optional;

import com.fabricaciontazas.demo.models.entity.Pedido;
import com.fabricaciontazas.demo.models.entity.Taza;

public interface PedidoTazaService {

		/** Guardar informacion del pedido */
		Pedido guardarPedido(Pedido pedido);
		
		/** Guardar informacion del pedido */
		Pedido agregarPedido(Pedido pedido);
	

}
