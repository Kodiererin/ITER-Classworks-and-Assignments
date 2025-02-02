package March_22;

public class a_rotateArray {
	public static void main(String[] args) {
		int[] arr = {1,-2,3,4,-4,6,-4,3,2};
//		System.out.println();
//		rotate(2, arr);
//		System.out.println(BinarySearch(4, 0, arr.length-1, arr));
		System.out.println(subArray(arr));
//		System.out.println(optimizedSol(arr));
	} 
//	Rotate an Array K times
	public static void rotate(int k , int [] arr) {
		for(int i=0 ; i<k ; i++) {
			int temp = arr[0];
			for(int j=0 ; j<arr.length-1 ; j++) {
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
		}
	}
//	Linear Search
	public static boolean linearSearch(int k , int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]==k) return true;
		}
		return false;
	}
//	Binary Search
	public static boolean BinarySearch(int k , int i , int j , int[] arr) {
		if(arr[i]==k || arr[j]==k) return true;
		if(arr[(i+j)/2]>k) {
			return BinarySearch(k, 0, (i+j)/2, arr);
		}
		else {
			return BinarySearch(k, (i+j)/2, arr.length , arr);
		}
	}
//	find the larget sum contiguous subArray
	public static int subArray(int[] arr) {
		int max = Integer.MIN_VALUE;
		int sum =0;
		for(int i=0 ; i<arr.length ; i++) {
			for(int  j=i ; j<arr.length; j++) {
				sum = sum+arr[j];
			}
			max = Math.max(max, sum);
			sum = 0;
		}
		return max;
	}
//	Bug in the code! Please Check!
	
//	Optimised Solution
	public static int optimizedSol(int[] arr) {
		int[] solarr = new int[arr.length];
		int max = Integer.MIN_VALUE;
		for(int i=1 ; i<arr.length ; i++) {
			solarr[i-1] = arr[i]+arr[i-1];
			arr[i] = arr[i]+arr[i-1];
			solarr[i-1] = arr[i]+solarr[i-1];
			max = Math.max(max, solarr[i-1]);
		}
		return max;
	}
}
