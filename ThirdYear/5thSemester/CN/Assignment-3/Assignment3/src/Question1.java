// 1.	WAP in Java to illustrate multithread using Thread class. (Multiple flow of control) 


class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + getId() + ": Count " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (Exception  e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question1 {
    public static void main(String[] args) {
    	System.out.println("--------------------------------------------------------------");
    	System.out.println("Name : Ujjwal Kumar");
    	System.out.println("Registration Number : 2141011063");
    	System.out.println("Section  : C");
    	System.out.println("--------------------------------------------------------------");
    	
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        System.out.println("Main Thread finished.");
    }
}
