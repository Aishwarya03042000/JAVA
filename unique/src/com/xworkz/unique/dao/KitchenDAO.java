package com.xworkz.unique.dao;

import java.util.Collection;

import com.xworkz.unique.dto.KitchenDTO;

public interface KitchenDAO {

	boolean saveUnique(KitchenDTO dto);

	Collection<KitchenDTO> findAllSortByUsedFor();

	Collection<KitchenDTO> findAllSortByUsedForDesc();

	Collection<KitchenDTO> findAllSortByName();

	// Collection<KitchenDTO> findAllSortByPriceDesc();

}