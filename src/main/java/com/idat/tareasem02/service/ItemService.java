package com.idat.tareasem02.service;

import java.util.List;

import com.idat.tareasem02.model.Items;


public interface ItemService {
	
	void guardarItem(Items items);
	void actualizarItem(Items items);
	void eliminarItem(Integer id);
	List<Items> listarItems();
	Items obtenerItemId(Integer id);

}
