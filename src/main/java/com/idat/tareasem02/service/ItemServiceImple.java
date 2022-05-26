package com.idat.tareasem02.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.tareasem02.model.Items;
import com.idat.tareasem02.repository.ItemRepository;

@Service
public class ItemServiceImple implements ItemService{

	@Autowired
	private ItemRepository repository;
	
	@Override
	public void guardarItem(Items items) {
		// TODO Auto-generated method stub
		repository.save(items);
	}

	@Override
	public void actualizarItem(Items items) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(items);
	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<Items> listarItems() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Items obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

}
