package com.hello;

public class Test {

	public static void main(String[] args) {
		Elements elements = new Elements();
		System.out.println("most frequent elements "+
				elements.frequentlyRepeatedElements(new int[] {1,1,1,1,2,2,2,3,3,3,3})
		);
		System.out.println("less frequent elements " +
				elements.lessFrequentlyRepeatedElements(new int[] {1,1,1,1,2,2,2,3,3,3,3})
				);
	}

}
