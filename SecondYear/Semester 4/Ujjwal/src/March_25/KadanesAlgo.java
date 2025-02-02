package March_25;

//	I was not active during the class.

public class KadanesAlgo {
	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(KadanensAlgorithm(arr));
	}
	public static int KadanensAlgorithm(int[] arr) {
		int max = Integer.MIN_VALUE;
		int arrayMax = 0;
		for(int i=0 ; i<arr.length ; i++) {
			arrayMax+=arr[i];
			if(max<arrayMax)
				max = arrayMax;
			if(arrayMax<0)
				arrayMax=0;
		}
		return max;
	}
}
