package com.fabricaciontazas.demo.services;

import java.util.List;
import java.util.Optional;

import com.fabricaciontazas.demo.models.entity.Pedido;
import com.fabricaciontazas.demo.models.entity.Taza;


public interface FabricacionTazaService {

	/** Consultar las tazas*/
	List<Taza> consultarTazas();
	
	/** Guardar informacion de las tazas */
	Taza guardarTaza(Taza taza);
	
	/** Guardar informacion de las tazas */
	Taza agregarTazas(Taza taza);
	
	
	/** modificar informacion de las tazas */
	Taza actualizarTaza(Taza taza);
	
	/** eliminar informacion de las tazas */
	void eliminarTaza(Long id);

	/** buscar una taza**/
	Optional<Taza> buscarTaza(Long id);
	
	
	/** Guardar informacion del pedido */
	//Pedido guardarPedido(Pedido pedido);
	
	/** Guardar informacion del pedido */
	//Pedido agregarPedido(Pedido pedido);
	
	
}
