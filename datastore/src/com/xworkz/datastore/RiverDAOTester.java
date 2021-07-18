package com.xworkz.datastore;

import com.xworkz.datastore.dao.RiverDAO;
import com.xworkz.datastore.dao.RiverDAOImpl;
import com.xworkz.datastore.dto.RiverDTO;

public class RiverDAOTester {

	public static void main(String[] args) {

		RiverDTO dto = new RiverDTO("Nethravathi", "Bangrabalige", 123, 2, true);
		RiverDTO dto1 = new RiverDTO("Kaveri", "TalaKaveri", 805, 4, true);

		RiverDAO dao = new RiverDAOImpl();
		dao.save(dto);
		dao.save(dto1);

		System.out.println(dao.totalItems());
		RiverDTO nethravathiUpdate = new RiverDTO("Nethravathi", "Bangrabalige", 132, 1, true);
		dao.update(nethravathiUpdate);
		System.out.println("Total Items: " + dao.totalItems());
		RiverDTO dtoToDelete = new RiverDTO("Kaveri", "Bangrabalige", 132, 1, true);
		dao.delete(dtoToDelete);
		System.out.println("Total Items: " + dao.totalItems());
	}

}
