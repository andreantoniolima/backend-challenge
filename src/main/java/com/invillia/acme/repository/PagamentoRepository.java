package com.invillia.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invillia.acme.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
