package com.cricket;

public class Cricketer {
	private int shirtNo;
	private String name;
	private String team;
	
	
	
	public Cricketer(int shirtNo, String name, String team) {
		this.shirtNo = shirtNo;
		this.name = name;
		this.team = team;
	}
	
	public int getShirtNo() {
		return shirtNo;
	}
	public void setShirtNo(int shirtNo) {
		this.shirtNo = shirtNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Cricketer (shirtNo=" + shirtNo + ", name=" + name + ", team=" + team + ")";
	}
	
	
}
