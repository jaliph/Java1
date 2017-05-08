package code.monk.math;

import java.util.ArrayList;

public class SieveOfEratosthenes {
	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		int num = 5;
 		ArrayList<Boolean> arr = new ArrayList<>();
 		for(int i = 0 ; i < num+1; i++ ){
 			arr.add(true);
 		}
 		for(int i = 2 ; i*i <= num ; i++ ){
 			if(arr.get(i) == true){
 				for(int j = i*2 ; j <= num ; j+=i){
 					arr.set(j, false);
 				}
 			}
 		}
 		
 		int count = 0;
 		for(int i = 2 ; i <= num ; i++ ){
 			if(arr.get(i) == true ){
 				System.out.print(i + " ,");
 				count++;
 				if(count%25==0){
 	 				System.out.println();
 	 			}
 			}
 			
 		}
	} 
	
}
