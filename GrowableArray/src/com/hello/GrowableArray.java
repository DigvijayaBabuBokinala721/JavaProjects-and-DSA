package com.hello;

import java.util.Arrays;

public class GrowableArray {
	
	private int[] arr = new int[1];
	private int index;
	
	public void add(int num) {
		
		if(index < capacity()) {
			arr[index] = num;
			index++;
		} 
		else {
			arr = increment(arr,capacity()*2);
			add(num);
		}
		
	}
	
	private int[] increment(int[] arr, int incrementalCapacity) {
		int[] newArr = new int[incrementalCapacity];
		for(int i=0;i<capacity();i++) {
			newArr[i] = arr[i];
		}
		
		return newArr;
	}
	
	public int capacity() {
		return arr.length;
	}
	public int size() {
	       return index;
	}

	public int[] getArray() {
        int[] actualData = new int[size()];
        for (int i = 0; i < size(); i++) {
            actualData[i] = arr[i];
        }
        return actualData;
    }
	
}
