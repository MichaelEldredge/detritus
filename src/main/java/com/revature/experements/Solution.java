package com.revature.experements;

import java.util.Arrays;

public class Solution {

	public static String solution(int ind) {
		// Your code here
        int N = 20;
		boolean [] possibleNewPrime = new boolean[N];
		String primeString = "";
		Arrays.fill(possibleNewPrime, true);
		possibleNewPrime[0] = false;
		possibleNewPrime[1] = false;
		for(int i = 0; i < N; i++) {
			if(possibleNewPrime[i]) {
				primeString += String.valueOf(i);
				for(int j = i; j < N; j+=i)
					possibleNewPrime[j] = false;
			}
		}
			
		return primeString.substring(ind, ind+5);
		
	}
	
}
