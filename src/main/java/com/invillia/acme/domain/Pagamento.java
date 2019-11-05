package com.invillia.acme.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.xml.crypto.Data;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private boolean status;
	
	private int numeroCart;

	private Data dataPagamento;
	
	@OneToOne(fetch = FetchType.LAZY )
	@JoinColumn(name = "PEDIDO_ID")
	@JsonIgnore
	private Pedido pedido;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getNumeroCart() {
		return numeroCart;
	}

	public void setNumeroCart(int numeroCart) {
		this.numeroCart = numeroCart;
	}

	public Data getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Data dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	

}
