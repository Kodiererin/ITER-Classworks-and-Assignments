package March_31;

public class sorting_BubbleSort {
	public static void main(String[] args) {
		int[] arr = {1,3,21,13,7};
		int[] arr2 = BubbleSort(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}
	}
	public static int[] BubbleSort(int[] arr) {
		for(int  i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}				
			}
		}
		return arr;
	}
}
