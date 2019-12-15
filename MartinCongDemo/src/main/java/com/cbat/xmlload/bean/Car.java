package com.cbat.xmlload.bean;

public class Car {
	public Car() {
		System.out.println("Car Counstruct() is Run");
	}
	public void initialize(){
		System.out.println(" Car init() is start*****");
	}
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}
