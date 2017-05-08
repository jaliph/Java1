package code.monk.math;

import java.util.ArrayList;
import java.util.Arrays;


public class Goldbach_conjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goldbach_conjecture gc = new Goldbach_conjecture();
		ArrayList<Integer> al = gc.SieveofEra(16777214);
		
		System.out.println(Arrays.toString(al.toArray()));
	}
	
	public ArrayList<Integer> SieveofEra(int a){
		ArrayList<Boolean> series = new ArrayList<>();
		for(int i = 0 ; i <= a+1; i++){
			series.add(true);
		}
		
		for(int i = 2 ; i*i <= a ; i++){
			if(series.get(i) == true){
				for(int j = i*2 ; j <= a ; j+=i){
					series.set(j, false);
				}
			}
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 2 ; i <= a ; i++ ){
			if(series.get(i) == true) al.add(i);
		}
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i = 0 ; i < al.size(); i++ ){
			if(Arrays.binarySearch(al.toArray(),(a-al.get(i)))>=0){
				al2.add(al.get(i));
				al2.add(a-al.get(i));
				break;
			}
		}
		return al2;
	}
}