package com.cbat.xmlload.dao;

import com.cbat.xmlload.bean.Car;

public abstract class CarDao {
	public  abstract Car getCar();

	public void initMethod(){
		System.out.println("原来的我");
	}
}
