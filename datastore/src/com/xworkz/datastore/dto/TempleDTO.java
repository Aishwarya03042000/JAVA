package com.xworkz.datastore.dto;

import java.io.Serializable;

public class TempleDTO implements Serializable {

	private String name;
	private int id;
	private String location;
	private int entryFee;
	private String specialPrasad;
	private int noOfPoojaris;
	private boolean male;
	private String mainGod;
	private boolean kalyani;

	public TempleDTO() {

	}

	public TempleDTO(String name, int id, String location, int entryFee, String specialPrasad, int noOfPoojaris,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.name = name;
		this.id = id;
		this.location = location;
		this.entryFee = entryFee;
		this.specialPrasad = specialPrasad;
		this.noOfPoojaris = noOfPoojaris;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
	}

	@Override
	public String toString() {
		return "TempleDTO [name=" + name + ", id=" + id + ", location=" + location + ", entryFee=" + entryFee
				+ ", specialPrasad=" + specialPrasad + ", noOfPoojaris=" + noOfPoojaris + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}

	public String getSpecialPrasad() {
		return specialPrasad;
	}

	public void setSpecialPrasad(String specialPrasad) {
		this.specialPrasad = specialPrasad;
	}

	public int getNoOfPoojaris() {
		return noOfPoojaris;
	}

	public void setNoOfPoojaris(int noOfPoojaris) {
		this.noOfPoojaris = noOfPoojaris;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isKalyani() {
		return kalyani;
	}

	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}

}