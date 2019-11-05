package com.invillia.acme.resouces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.invillia.acme.domain.Pagamento;
import com.invillia.acme.domain.Pedido;

import com.invillia.acme.repository.PagamentoRepository;


@RestController
@RequestMapping({"/acme"})
public class PagamentoResources {
	
	@Autowired
	private PagamentoRepository pagamentorepository;
	
	@PostMapping("{id}/InserirPagamento")
	public void InserirItem(@PathVariable("id") Pedido pedidoId, @RequestBody Pagamento pagamento) {
		pagamento.setPedido(pedidoId);
		pagamentorepository.save(pagamento);
	}

}
