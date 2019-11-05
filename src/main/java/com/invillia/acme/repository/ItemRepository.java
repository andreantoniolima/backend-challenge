package com.invillia.acme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invillia.acme.domain.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
