package com.fabricaciontazas.demo.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fabricaciontazas.demo.models.entity.Pedido;
import com.fabricaciontazas.demo.models.entity.Taza;
import com.fabricaciontazas.demo.repositorio.FabricacionTazaRepository;
import com.fabricaciontazas.demo.repositorio.PedidoTazaRepository;
import com.fabricaciontazas.demo.services.FabricacionTazaService;

@Service
public class FabricacionTazaServiceImpl implements FabricacionTazaService {

	@Autowired
	private FabricacionTazaRepository tazaRepository;
	//private PedidoTazaRepository pedidoRepository;
	
	@Override
	public List<Taza> consultarTazas() {
		
		List<Taza> tazaDataSource = StreamSupport.stream(
				this.tazaRepository.findAll().spliterator(),false)
				.collect(Collectors.toList());
		
		return tazaDataSource;
	}

	@Override
	public Taza guardarTaza(Taza taza) {	
		return this.tazaRepository.save(taza);
	}
	
	@Override
	public Taza agregarTazas(Taza taza) {	
		return this.tazaRepository.save(taza);
	}

	@Override
	public Taza actualizarTaza(Taza taza) {
		
		return this.tazaRepository.save(taza);
	}

	@Override
	public void eliminarTaza(Long id) {
	
		this.tazaRepository.deleteById(id);
	}
	
	@Override
	public Optional<Taza> buscarTaza(Long id) {
	
		return this.tazaRepository.findById(id);
	}

	

}
