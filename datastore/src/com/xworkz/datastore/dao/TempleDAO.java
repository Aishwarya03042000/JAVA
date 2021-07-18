package com.xworkz.datastore.dao;

import com.xworkz.datastore.dto.TempleDTO;

import java.util.Collection;

public interface TempleDAO {

	boolean save(TempleDTO dto);

	boolean delete(TempleDTO dto);

	int totalItems();

	TempleDTO findFirstItem();

	TempleDTO findLastItem();

	TempleDTO findBYName(String name);

	TempleDTO findByLocation(String location);

	TempleDTO findByLocationAndName(String name, String location);

	Collection<TempleDTO> findAll();

	Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);

	Collection<TempleDTO> findAllTempleByNoOFPoojarisGreaterThan(int no);

	Collection<TempleDTO> findAllTempleByLocationStartsWith(char character);

}