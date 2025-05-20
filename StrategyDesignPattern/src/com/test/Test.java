package com.test;

import com.engine.DieselEngine;
import com.engine.PetrolEngine;
import com.vehicle.Car;

public class Test {

	public static void main(String[] args) {
		Car maruti_suzuki1 = new Car(new PetrolEngine());
		maruti_suzuki1.start();
		maruti_suzuki1.stop();

//		Car maruti_suzuki2 = new Car(new DieselEngine());
//		maruti_suzuki2.start();
	}

}
