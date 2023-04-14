package April_14;

//	Given an array of 
public class b_RangePortion {
	public static void main(String[] args) {
		compute();
	}
//	Given an array of integers and a range.Write a program to partition the array so, that value 
//	smaller than range comes on left and greater than range comes right and value under range comes at middle.

	public static void compute() {
		int[] arr = {0,2,1,3,5,7,9,6,7,11,10};
		int left = 0;
		int right = arr.length-1; 
		int i=0;
		while(i<arr.length) {
			if(arr[i]<arr[left]) {
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;
				left++;
				i++;
			}
			else if(arr[i]>arr[right]) {
				int temp = arr[i];
				arr[i] = arr[right];
				arr[right] = temp;				
				i++;
			}
			else {
				i++;
			}
		}
		for(int j=0 ; j<arr.length ; j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
