package com.hello;

import java.util.Scanner;
import java.util.function.Predicate;

public class PrimeNumber {

	static Predicate<Integer> chk1 = n->n==1;
	static Predicate<Integer> chk2 = n->n==2 || n==3;
	static Predicate<Integer> chk3 = n->n%2==0 || n%3==0;
	public static boolean isPrime(int n){
		if(chk1.test(n))
			return false;
		if(chk2.test(n))
			return true;
		if(chk3.test(n))
			return false;
		for(int i=5;i*i<=n;i+=6){
			if(n%i == 0||n%(i+2) == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println(isPrime(sc.nextInt())?"Prime":"Not Prime");
		}
	}
 
}

