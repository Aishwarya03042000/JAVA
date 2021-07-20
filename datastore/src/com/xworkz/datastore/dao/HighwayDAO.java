package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.constants.HighwayType;
import com.xworkz.datastore.dto.HighwayDTO;

public interface HighwayDAO {

	boolean save(HighwayDTO dto);

	int totalItems();

	Collection<HighwayDTO> findAll();

	Collection<Integer> findAllNumber();

	Collection<HighwayDTO> findNumberByStateName(String name);

	boolean exist(HighwayDTO dto);

	Collection<HighwayDTO> findByStateName(String sname);

	Collection<HighwayDTO> findByHighwayType(HighwayType type);

	boolean isCondition(int num);

	double lengthByNumber(int no);

	HighwayDTO findByMaxLength();

	HighwayDTO findByminLength();

}