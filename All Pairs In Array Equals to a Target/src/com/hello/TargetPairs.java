package com.hello;

import java.util.HashSet;

public class TargetPairs {
	
	public static void findAllPairs(int[] arr, int target) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		
		for(int i:arr) {
			int complement = target - i;
			if(hs.contains(complement))
				System.out.println(i + " " + complement);
			hs.add(i);
		}
		
	}
	
}
