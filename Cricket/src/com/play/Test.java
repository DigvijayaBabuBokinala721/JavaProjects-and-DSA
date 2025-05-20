package com.play;

import java.util.List;
import java.util.stream.Stream;

import com.cricket.Cricketer;
import com.ipl.Team;

public class Test {

	public static void main(String[] args) {
		List<Cricketer> li = Team.myTeam();
		System.out.println("My Dream11:");
		System.out.println();
		li.stream().forEach(System.out::println);//forEach() method will accept instance of consumer functional interface
		
		System.out.println();
		
		//filter() method will accept predicate as the parameter
		Stream<Cricketer> captain = li.stream().filter(cktr->cktr.getName().equalsIgnoreCase("virat"));
		System.out.println("Captain: ");
		captain.forEach(System.out::println);
		
		
	}

}
