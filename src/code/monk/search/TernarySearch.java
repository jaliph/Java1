package code.monk.search;

public class TernarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		int search = 9;
		int left = 0;
		int right = arr.length-1;
		while(left<right){
			int mid1 = left + (right-left)/3;
			int mid2 = right - (right-left)/3;
			
			if(arr[mid1]==search){
				System.out.println(mid1+"->"+arr[mid1]);
				System.exit(1);
			}
			if(arr[mid2]==search){
				System.out.println(mid2+"->"+arr[mid2]);
				System.exit(1);
			}
			if(search  < arr[mid1]){
				right = mid1-1;
			}if(search > arr[mid2]){
				left = mid2+1;
			}else{
				left = mid1+1;
				right = mid2-1;
			}
		}
	}
}
