package com.revature.experements;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Primes {
	public static void main(String[] args) {
		int N = 30000;
		boolean [] possibleNewPrime = new boolean[N];
		List<Integer> primes = new LinkedList<Integer>();
		String primeString = "";
		
		possibleNewPrime[0] = false;
		possibleNewPrime[1] = false;
		
		for(int i = 0; i < N; i++) 
			if(possibleNewPrime[i]) {
				primes.add(i);
				primeString += String.valueOf(i);
				for(int j = i; j < N; j+=i)
					possibleNewPrime[j] = false;
			}
		System.out.println(primeString.substring(3, 3+5));
	}
}
