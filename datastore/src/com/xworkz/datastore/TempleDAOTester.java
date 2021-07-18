package com.xworkz.datastore;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOImpl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOTester {

	public static void main(String[] args) {

		TempleDTO dto = new TempleDTO("Channabasaveshwara Temple", 30, "Gubbi", 20, "Panchkajjaya", 4, true,
				"Gosala Basaveshwara", true);
		TempleDTO dto1 = new TempleDTO("Anjaneya temple", 15, "Hirehalli", 10, "Rasayana", 2, true, "Basavanna", false);
		TempleDTO dto2 = new TempleDTO("Mallikarjuna Temple", 20, "Bandur", 20, "Sweet Pongal", 3, true, "Datta",
				false);
		TempleDTO dto3 = new TempleDTO("Devi Temple", 50, "Arsikere", 31, "Rice", 5, false, "Raghavendra", true);
		TempleDTO dto4 = new TempleDTO("SaiBaba temple", 50, "Tumkur", 10, "Avalakki", 4, true, "Sai baba", true);

		TempleDAO dao = new TempleDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);
		dao.save(dto4);
		dao.totalItems();
		dao.findFirstItem();
		dao.findLastItem();

		TempleDTO dtoDelete = new TempleDTO("Channabasaveshwara Temple", 30, "Gubbi", 20, "Panchkajjaya", 4, true,
				"Gosala Basaveshwara", true);
		dao.delete(dtoDelete);

		TempleDTO findbyName = dao.findBYName("Devi temple");
		System.out.println("findbyName:" + findbyName);

		TempleDTO findbyLocation = dao.findByLocation("Arsikere");
		System.out.println("find by Location: " + findbyLocation);

		TempleDTO findbyLocationAndName = dao.findByLocationAndName("Devi temple", "Arsikere");
		System.out.println("find by LocationAndName: " + findbyLocationAndName);

		dao.findAll();
		dao.findAllTempleByEntryFeeGreaterThan(200.00d);
		dao.findAllTempleByNoOFPoojarisGreaterThan(20);
	}
}