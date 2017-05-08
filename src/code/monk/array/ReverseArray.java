package code.monk.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
	int[] arr;
	
	public void setArray(int[] aa){
		this.arr = aa;
	}
	
	public void print(int i){
		if(i==arr.length){
			return;
		}else{
			print(i+1);
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReverseArray r = new ReverseArray();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
        	array[i] = Integer.parseInt(br.readLine());   
        }
		r.setArray(array);
		r.print(0);
	}
}
