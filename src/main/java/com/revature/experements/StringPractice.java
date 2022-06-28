package com.revature.experements;

import java.util.Arrays;

public class StringPractice {
	public static void main(String[] args) {
		String abcd = "abcad";
		char [] arr = abcd.toCharArray();
		Arrays.sort(arr);
		int i = 0;
		String result = "";
		while (i < arr.length - 1) {
			if (arr[i] == arr[i+1]) {
				result = result + arr[i] + arr[i];
				i += 2;
			}
			else {
				i++;
			}
		}
		System.out.println(result);
	}
}
