package code.monk.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoPowerCheck {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number");
		int n = Integer.parseInt(br.readLine());
		if( (n & (n-1)) == 0){ //Zero Case is Not Handled
			System.out.println("It is a power of 2");
		}else{
			System.out.println("It is not a power of 2");
		}
		br.close();
	}

}
