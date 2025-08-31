package com.hello;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Elements {
	public List<Integer> frequentlyRepeatedElements(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i:arr)
			hm.put(i,hm.getOrDefault(i, 0)+1);
		
		int countOfFreEle = hm.values().stream().max(Integer::compare).get();
		
		return hm.entrySet().stream()
		.filter(entryMap->entryMap.getValue() == countOfFreEle)
		.map(keyValue->keyValue.getKey()).collect(Collectors.toList());

	}

	public List<Integer> lessFrequentlyRepeatedElements(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i:arr)
			hm.put(i,hm.getOrDefault(i, 0)+1);
		
		int countOfFreEle = hm.values().stream().min(Integer::compare).get();
		
		return hm.entrySet().stream()
				.filter(entryMap->entryMap.getValue() == countOfFreEle)
				.map(keyValue->keyValue.getKey()).collect(Collectors.toList());
		
	}
}
