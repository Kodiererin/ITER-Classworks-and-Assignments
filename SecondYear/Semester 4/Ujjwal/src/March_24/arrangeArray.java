package March_24;
//	WAP, given an array of sine n , containing element from  (0 to n-1). All value from (0 TO N-1) 
//	present there and if not then -1 takes place

//	Arrange the value of array such that the value of i such that value of i is stored in a[i]
public class arrangeArray {
	public static void main(String[] args) {
		int[] arr = {8,-1,6,1,9,3,2,7,4,-1};
		int[] arr2 = arrangeArray(arr);
		for(int i=0 ; i<arr2.length ; i++) {
			System.out.println(arr2[i]);
		}

	}
	public static int[] arrangeArray(int[] arr) {
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<arr.length ; j++) {
				if(arr[j]==i) {
					int temp = arr[j];
					arr[j] = arr[i]; 
					arr[i]= temp;
					break;
				}
			}
		}
		return arr;
	}
	
}
