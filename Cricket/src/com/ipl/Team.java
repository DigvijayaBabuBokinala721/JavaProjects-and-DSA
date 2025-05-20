package com.ipl;

import java.util.ArrayList;
import java.util.List;

import com.cricket.Cricketer;

public class Team {

	public static ArrayList<Cricketer> myTeam() {
		ArrayList<Cricketer> li = new ArrayList<>();
		
		Cricketer ckt1 = new Cricketer(18, "Virat", "RCB");
		Cricketer ckt2 = new Cricketer(45, "Rohit", "MI");
		Cricketer ckt3 = new Cricketer(1, "KL Rahul", "DC");
		Cricketer ckt4 = new Cricketer(99, "Bumrah", "MI");
		Cricketer ckt5 = new Cricketer(7, "Dhoni", "CSK");
		Cricketer ckt6 = new Cricketer(17, "pant", "LSG");
		Cricketer ckt7 = new Cricketer(33, "hardik", "MI");
		Cricketer ckt8 = new Cricketer(17, "ABD", "RCB");
		Cricketer ckt9 = new Cricketer(38, "Hazelwood", "RCB");
		Cricketer ckt10 = new Cricketer(73, "siraj", "GT");
		Cricketer ckt11 = new Cricketer(15, "Bhuvi", "RCB");
		
		
		li.add(ckt1);
		li.add(ckt2);
		li.add(ckt3);
		li.add(ckt4);
		li.add(ckt5);
		li.add(ckt6);
		li.add(ckt7);
		li.add(ckt8);
		li.add(ckt9);
		li.add(ckt10);
		li.add(ckt11);
		
		return li;
	}

}
