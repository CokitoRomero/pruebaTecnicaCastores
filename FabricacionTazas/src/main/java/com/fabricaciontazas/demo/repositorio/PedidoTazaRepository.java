package com.fabricaciontazas.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.fabricaciontazas.demo.models.entity.Pedido;

public interface PedidoTazaRepository extends CrudRepository<Pedido, Long> {

}
