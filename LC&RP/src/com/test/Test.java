package com.test;

import com.mobile.Mobile;
import com.simcard.Airtel;
import com.simcard.Jio;

public class Test {

	public static void main(String[] args) {
		Mobile samsung = new Mobile();
		samsung.insertSim(new Jio());
		samsung.insertSim(new Airtel());
	}

}
