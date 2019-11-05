package com.invillia.acme.resouces;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invillia.acme.domain.Loja;
import com.invillia.acme.repository.LojaRepository;

@RestController
@RequestMapping({"/acme"})

public class LojaResources {

	@Autowired
	private LojaRepository lojarepository;
	//Buscar todas as lojas
	@GetMapping({"/buscarLojas"})
	  public List<Loja> BuscarLojas()
	  {
		return lojarepository.findAll();
	  }
	
	//Buscar uma loja por parametro
	
	@GetMapping({"/buscarLojas/{id}"})
	  public Optional<Loja> BuscarLoja(@PathVariable("id") Long id)
	  {
		return lojarepository.findById(id);
	  }
	

	//Criar Loja
	@PostMapping("/criarloja")
	public void CriarLoja(@RequestBody Loja loja) {
		lojarepository.save(loja);
	}
  //Atualizar loja com parametro
  @PutMapping(value = "/atualizarLoja/{id}")
	public void updateLoja(@RequestBody Loja loja, @PathVariable("id") Long id) {
        loja.setId(id); 
        lojarepository.save(loja);
		
	}
	
}
