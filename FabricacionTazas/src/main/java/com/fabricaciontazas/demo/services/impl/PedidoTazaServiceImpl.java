package com.fabricaciontazas.demo.services.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fabricaciontazas.demo.models.entity.Pedido;
import com.fabricaciontazas.demo.repositorio.PedidoTazaRepository;

import com.fabricaciontazas.demo.services.PedidoTazaService;

@Service
public class PedidoTazaServiceImpl implements PedidoTazaService {

	@Autowired
	private PedidoTazaRepository pedidoRepository;
	
	@Override
	public Pedido guardarPedido(Pedido pedido) {
		return this.pedidoRepository.save(pedido);
	}

	@Override
	public Pedido agregarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return this.pedidoRepository.save(pedido);
	}
	
}
