package com.engine;

public class DieselEngine implements Engine{

	@Override
	public void startEngine() {
		System.out.println("DieselEngine has been started...");
	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine has been stopped!");
		
	}

}
