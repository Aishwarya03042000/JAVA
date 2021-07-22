package com.xworkz.unique.comparator;

import java.util.Comparator;

import com.xworkz.unique.dto.KitchenDTO;

public class KitchenByNameComparator implements Comparator<KitchenDTO> {

	@Override
	public int compare(KitchenDTO o1, KitchenDTO o2) {

		return o1.getName().compareTo(o2.getName());
	}

}