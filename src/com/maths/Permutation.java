package com.maths;

public class Permutation {
	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "BRAHEMJEET";
		permute(str,0,str.length()-1);
		System.out.println(count);
	}
	
	public static void permute(String str , int l, int r){
		if(l==r){
			System.out.println(str);
			count++;
		}else{
			for(int i = l ; i <= r ; i++){
				str = swap(str,l,i);
				permute(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}
	public static String swap(String str, int i, int j){
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

}

