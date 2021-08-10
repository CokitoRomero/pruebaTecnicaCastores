package com.fabricaciontazas.demo.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "taza")
public class Taza {

	@Id
	@Column(name="PK_TAZA")
	private Long id;
	
	@Column(name="TIPO")
	private String tipo;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="DIMENSIONES")
	private String dimensiones;
	
	@Column(name="CAPACIDAD")
	private String capacidad;
	
	@Column(name="MODELO")
	private String modelo;
	
	@Column(name="MATERIAL")
	private String material;
	
	@Column(name="PRECIO")
	private double precio;
	
	@Column(name="STOCK")
	private int stock;
	
}
