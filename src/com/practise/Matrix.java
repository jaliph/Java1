package com.practise;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { {1,0,1}, {1,0,0} ,{0,0,0 }};
		for(int i = 0 ; i < mat.length ; i++ ){
			for(int j = 0 ; j < mat[i].length; j++){
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		int x = 1, y = 2;
		for(int i = 0 ; i < 4 ; i++){
			for(int j = 0 ; j < 4; j++){
				if( ((i+j) == (x+y)) ){
					System.out.println("+"+i+","+j);
				}
				if( ((i-j) == (x-y)  )){
					System.out.println("-"+i+","+j);
				}
			}
		}
		
	}	

}
