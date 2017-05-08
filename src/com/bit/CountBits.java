package com.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountBits {
	//binary representation of (x-1) can be obtained by simply flipping all the bits to the right of rightmost 1 in x and also including the rightmost 1.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a no.");
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		while( n > 0 ){
			n = n & (n - 1);
			count++;
		}
		System.out.println("No. of On Bits is : "+ count);
		br.close();
	}

}
