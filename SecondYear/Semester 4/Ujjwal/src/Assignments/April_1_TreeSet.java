package Assignments;

public class April_1_TreeSet {
	public static void main(String[] args) {
		compute();
	}
	public static void compute() {
		java.util.TreeSet<Integer> obj = new java.util.TreeSet<>();
		for(int i=0 ; i<10 ; i++)	obj.add((int)(Math.random()*100)+0);
		
//		Display the Tree Set
		System.out.println(obj);
		
//		Asking the user if the element is present in the tree set or not
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter A Number ");
		int x = sc.nextInt();
		
		System.out.println(obj.contains(x));
		
//		Remove an element from tree
		int y = sc.nextInt();
		obj.remove(y);
		
//		Display the Tree Set
		System.out.println(obj);
	}
}
