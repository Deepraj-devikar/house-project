package com.houseproject;

import java.util.ArrayList;
import java.util.Iterator;

public class HouseProject {

	public void printHouses(HouseRepository houseRepository) {
		ArrayList<House> houses = houseRepository.getHouses();
		Iterator<House> houseIterator = houses.iterator();
		while(houseIterator.hasNext()) {
			System.out.println(houseIterator.next());
		}
	}
	
	public void addHouses(HouseRepository houseRepository) {
		House house1 = new House();
		house1.setNumber(1);
		house1.setName("Prakash");
		house1.setColor("Gray");
		
		House house2 = new House();
		house2.setNumber(2);
		house2.setName("Rajat");
		house2.setColor("Green");
		
		House house3 = new House();
		house3.setNumber(3);
		house3.setName("Rakesh");
		house3.setColor("Red");
		
		House house4 = new House();
		house4.setNumber(4);
		house4.setName("Pushpak");
		house4.setColor("Yellow");
		
		House house5 = new House();
		house5.setNumber(5);
		house5.setName("Rupesh");
		house5.setColor("Bllue");

		houseRepository.add(house1);
		houseRepository.add(house2);
		houseRepository.add(house3);
		houseRepository.add(house4);
		houseRepository.add(house5);
	}
	
	public static void main(String[] args) {
		HouseProject houseProject = new HouseProject();
		HouseRepository houseRepository = new HouseRepository();
		houseProject.addHouses(houseRepository);
		houseProject.printHouses(houseRepository);
	}
}
