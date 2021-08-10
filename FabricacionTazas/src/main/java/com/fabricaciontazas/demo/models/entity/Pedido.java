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
@Table(name = "pedido")
public class Pedido {

	@Id
	@Column(name="PK_PEDIDO")
	private Long idPedido;
	
	//@Column(name="FK_TAZA")
	//private int idTaza;
	
	@Column(name="NUM_PEDIDO")
	private String npedido;
	
	@Column(name="CANTIDAD")
	private int cantidad;
	
	@Column(name="TOTAL")
	private double total;
	
}
