package com.houseproject;

import java.util.ArrayList;
import java.util.Iterator;

public class HouseProject {

	public void printHouses(ArrayList<House> houses) {
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
		house1.setPrice(100000);
		
		House house2 = new House();
		house2.setNumber(2);
		house2.setName("Rajat");
		house2.setColor("Green");
		house2.setPrice(200000);
		
		House house3 = new House();
		house3.setNumber(3);
		house3.setName("Rakesh");
		house3.setColor("Red");
		house3.setPrice(1400000);
		
		House house4 = new House();
		house4.setNumber(4);
		house4.setName("Pushpak");
		house4.setColor("Yellow");
		house4.setPrice(500000);
		
		House house5 = new House();
		house5.setNumber(5);
		house5.setName("Rupesh");
		house5.setColor("Bllue");
		house5.setPrice(600000);
		
		houseRepository.add(house1);
		houseRepository.add(house2);
		houseRepository.add(house3);
		houseRepository.add(house4);
		houseRepository.add(house5);
	}
	
	public House houseWithHighPrice(ArrayList<House> houseList) {
		House highestPricedHouse = houseList.get(0);
		for(int i = 1; i < houseList.size(); i++) {
			House tempHouse = houseList.get(i);
			if(highestPricedHouse.getPrice() < tempHouse.getPrice()) {
				highestPricedHouse = tempHouse;
			}
		}
		return highestPricedHouse;
	}
	
	public ArrayList<House> housesLesserThanPrice(ArrayList<House> houseList, float price){
		ArrayList<House> lesserPricedHouses = new ArrayList<House>();
		for(int i = 0; i < houseList.size(); i++) {
			if(houseList.get(i).getPrice() < price) {
				lesserPricedHouses.add(houseList.get(i));
			}
		}
		return lesserPricedHouses;
	}
	
	public static void main(String[] args) {
		HouseProject houseProject = new HouseProject();
		HouseRepository houseRepository = new HouseRepository();
		houseProject.addHouses(houseRepository);
		houseProject.printHouses(houseRepository.getHouses());
		System.out.println();
		System.out.println("House with highest price is "+houseProject.houseWithHighPrice(houseRepository.getHouses()));
		System.out.println();
		System.out.println("Houses lesser than price 500000");
		houseProject.printHouses(houseProject.housesLesserThanPrice(houseRepository.getHouses(), 500000));
	}
}
