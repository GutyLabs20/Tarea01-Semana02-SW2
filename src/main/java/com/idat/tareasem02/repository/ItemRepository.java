package com.idat.tareasem02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.tareasem02.model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer>{

}
