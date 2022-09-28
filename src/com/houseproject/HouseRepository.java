package com.houseproject;

import java.util.ArrayList;

public class HouseRepository {
	private ArrayList<House> houses = new ArrayList<House>();
	
	public void add(House house) {
		houses.add(house);
	}

	public ArrayList<House> getHouses() {
		return houses;
	}
}
