package com.fabricaciontazas.demo.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.fabricaciontazas.demo.models.entity.Taza;



public interface FabricacionTazaRepository extends CrudRepository<Taza, Long> {

}
