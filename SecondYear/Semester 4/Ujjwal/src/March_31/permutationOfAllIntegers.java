package March_31;
//	IMP Question.
public class permutationOfAllIntegers {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		anagram(arr, 0, arr.length);
	}
	public static void anagram(int[] arr , int i , int j) {
		if(i==j) {
			for(int a=0 ; a<arr.length ; a++) {
				System.out.print(arr[a]);
			}
			System.out.println();
			return;
		}
		for(int k=i ; k<j ; k++) {
			arr = swap(arr,i,k);
			anagram(arr,i+1,j);
			arr = swap(arr,k,i);
		}
	}
	public static int[] swap(int[] arr , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;
	}
}
