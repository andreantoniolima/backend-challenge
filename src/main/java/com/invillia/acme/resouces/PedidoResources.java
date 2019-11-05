package com.invillia.acme.resouces;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invillia.acme.domain.Item;
import com.invillia.acme.domain.Pedido;
import com.invillia.acme.repository.ItemRepository;
import com.invillia.acme.repository.PedidoRepository;


@RestController
@RequestMapping({"/acme"})

public class PedidoResources {
	
	@Autowired
	private PedidoRepository pedidorepository;
	
	private ItemRepository itemrepository;
	
	//Criar Pedido
	
		@PostMapping("/criarPedido")
		public void CriarLoja(@RequestBody Pedido pedido) {
			pedidorepository.save(pedido);
		}
		
	//Inserir item no pedido
		
		@PostMapping("{id}/InserirItem")
		public void InserirItem(@PathVariable("id") Pedido pedidoId, @RequestBody Item item) {
			item.setPedido(pedidoId);
			itemrepository.save(item);
		}
		
	//Buscar pedido por parametro
		
		@GetMapping({"/buscarPedido/{id}"})
		  public Optional<Pedido> BuscarLoja(@PathVariable("id") Long id)
		  {
			return pedidorepository.findById(id);
		  }
		
}
