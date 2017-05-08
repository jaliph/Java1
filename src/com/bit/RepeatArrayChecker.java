package com.bit;

public class RepeatArrayChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1,1,3,3,3};
		System.out.println(singleNumber(x));
	}
	
	public static int singleNumber(int[] A) {
		int x = 0;
		for (int a : A) {
			x = x ^ a;
		}
		return x;
	}
}
