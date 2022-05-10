package com.ted.spring.factory;

import org.springframework.beans.factory.FactoryBean;

public class MyFactory implements FactoryBean<Car>{

	@Override
	public Car getObject() throws Exception {
		Car car = new Car();
		car.setBrand("保時捷");
		car.setPrice(10000000);
		return car;
	}

	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

}
