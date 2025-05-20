package com.test;
import java.util.HashMap;

import com.student.Student;

public class Test {

	public static void main(String[] args) {
		HashMap<Student, Double> clg = new HashMap<Student, Double>();

		Student s1 = new Student(101, "vijay", "cse"); 
		Student s2 = new Student(102, "chinnu", "ai&ml"); 
		Student s3 = new Student(103, "david", "ece"); 
		Student s4 = new Student(104, "wood", "cse"); 
		Student s5 = new Student(105, "vijay", "cse"); 
		Student s6 = new Student(105, "vijay", "cse"); //duplicate student
		Student s7 = new Student(103, "david", "ece"); //duplicate student
		
		clg.put(s1, 65_000.00);
		clg.put(s2, 1_50_000.00);
		clg.put(s3, 35_000.00);
		clg.put(s4, 65_000.00);
		clg.put(s5, 65_000.00);
		
		//adding duplicate student to college is not allowed
		clg.put(s5, 65_000.00);
		clg.put(s6, 35_000.00);
		
		System.out.println(clg);
	
	}

}
