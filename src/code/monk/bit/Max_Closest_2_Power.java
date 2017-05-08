package code.monk.bit;

public class Max_Closest_2_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(1024));
	}
	public static int power(int num){
		num = num | num >> 1;
		num = num | num >> 2;
		num = num | num >> 4;
		num = num | num >> 8;
		
		return (num+1) >> 1;
	}

}