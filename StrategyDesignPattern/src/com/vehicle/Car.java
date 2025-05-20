package com.vehicle;

import com.engine.Engine;

public class Car {
	private Engine eng;
	
	public Car(Engine eng)
	{
		this.eng = eng;
	}
	public void start() {
		eng.startEngine();
	}
	public void stop() {
		eng.stopEngine();
	}

}
