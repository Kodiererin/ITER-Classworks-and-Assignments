package March_29;

public class GCDUsingRecursion {
	public static void main(String[] args) {
		System.out.println(GCD(13,169));
		System.out.println(GCD(4,10));
	}
	public static int GCD(int x , int y) {
		if(x==0)
			return y;
		return GCD(y%x,x);
	}
}
