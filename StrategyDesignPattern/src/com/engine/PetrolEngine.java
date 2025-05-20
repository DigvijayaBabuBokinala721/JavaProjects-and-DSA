package com.engine;

public class PetrolEngine implements Engine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine has been started...");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine has been stopped!");		
	}
	
}
