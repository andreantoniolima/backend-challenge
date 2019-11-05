package com.invillia.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invillia.acme.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>  {

}
