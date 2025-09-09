package com.hello;

import java.util.stream.IntStream;

public class Triangle {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 7).forEach(n->System.out.println("*".repeat(n)));
	}
}
