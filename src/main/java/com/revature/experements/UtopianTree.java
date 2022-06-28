package com.revature.experements;

public class UtopianTree {
	public static void main(String[] args) {
		for (int i = 0; i < 6; i++)
		System.out.println(i + " " + tree(i));
	}
	private static int tree(int n) {
		if (n == 0)
			return 1;
		else if (n%2 == 0)
			return (int) tree(n-1) + 1;
		else
			return (int) tree(n-1)*2;
	}
}
