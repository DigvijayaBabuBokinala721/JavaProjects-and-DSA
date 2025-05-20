package com.student;
import java.util.Objects;

public class Student {
	private int rno;
	private String name;
	private String branch;
	
	public Student(int rno, String name, String branch) {
		super();
		this.rno = rno;
		this.name = name;
		this.branch = branch;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(branch, name, rno);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student s)
			return this.rno == s.rno && this.name.equals(s.name) && this.branch.equals(s.branch);
		return false;
	}

	@Override
	public String toString() {
		return "\nStudent (rno=" + rno + ", name=" + name + ", branch=" + branch + ")";
	}
	
	
}
