package com.houseproject;

public class House {
	int number;
	String name;
	String color;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "House Number :- "+number+", House Name :- "+name+", House Color :- "+color;
	}
}
