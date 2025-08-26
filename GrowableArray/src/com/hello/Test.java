package com.hello;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		GrowableArray array = new GrowableArray();
		array.add(1);
		array.add(2);
		Arrays.stream(array.getArray()).forEach(System.out::println);
		System.out.println("capacity : " + array.capacity());
	}
	
}
