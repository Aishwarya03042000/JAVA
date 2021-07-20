package com.xworkz.datastore;

import java.util.Collection;

import com.xworkz.datastore.constants.HighwayType;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dao.HighwayDAO;
import com.xworkz.datastore.dao.HighwayDAOImpl;

public class HighwayDAOTester {

	public static void main(String[] args) {

		HighwayDTO dto = new HighwayDTO("NH02", 19, HighwayType.NATIONALHIGHWAY, "Assam, Nagaland, Manipur, Mizoram",
				1325.6d, true, "AssamConstructions");
		HighwayDTO dto1 = new HighwayDTO("NH06", 31, HighwayType.NATIONALHIGHWAY,
				"Gujarat, Maharastra, Chattisgarh, Odisha, Jharkhand", 1949.00d, true, "BirlaConstructions");
		HighwayDTO dto2 = new HighwayDTO("NH44", 43, HighwayType.NATIONALHIGHWAY, "Karnataka", 4112.00d, true,
				"ACCConstructions");
		HighwayDTO dto3 = new HighwayDTO("NH 1", 4, HighwayType.STATEHIGHWAY, "JammuKashmir, Ladakh", 534.00d, true,
				"TATAConstructions");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);

		System.out.println("totalItems : " + dao.totalItems());

		Collection<HighwayDTO> all = dao.findAll();
		for (HighwayDTO highway : all) {
			System.out.println("FindAll : " + highway);
		}

		Collection<Integer> findnumber = dao.findAllNumber();
		for (Integer in : findnumber) {
			System.out.println("find all number : " + in);
		}

		Collection<HighwayDTO> numberbystatename = dao.findNumberByStateName("Karnataka");
		for (HighwayDTO highway : numberbystatename) {
			System.out.println(highway);
		}

		Collection<HighwayDTO> bystatename = dao.findByStateName("Andhra");
		for (HighwayDTO dt : bystatename) {
			System.out.println(dt);
		}

		boolean contain = dao.exist(dto3);
		System.out.println("found : " + contain);

		Collection<HighwayDTO> highwaytype = dao.findByHighwayType(HighwayType.STATEHIGHWAY);
		for (HighwayDTO way : highwaytype) {
			System.out.println(way);
		}

		boolean condition = dao.isCondition(63);
		System.out.println("Highway condition : " + condition);

		double len = dao.lengthByNumber(48);
		System.out.println("findbylength : " + len);

		HighwayDTO maxleng = dao.findByMaxLength();
		System.out.println("max length : " + maxleng);

		HighwayDTO minleng = dao.findByminLength();
		System.out.println("min length : " + minleng);

	}

}