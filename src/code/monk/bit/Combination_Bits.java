package code.monk.bit;

public class Combination_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCDE";
		combine(str.toCharArray(),str.length());
	}
	public static void combine(char[] arr, int size){
		for(int i = 0 ; i < 1<<size ; i++){
			for(int j = 0 ; j < size ; j++){
				if((i & 1 << j)>0){
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}
	}
}
