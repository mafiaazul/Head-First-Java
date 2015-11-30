
public class ThreadTestDrive {
<<<<<<< HEAD

	public static void main (String[] args) {
		
		Runnable threadJob = new MyRunnable();
		Thread myThread = new Thread(threadJob);
		
		myThread.start();
		
		System.out.println("back in main");
		
=======
	
	public static void main (String[] args) {
		Runnable theJob = new MyRunnable();
		Thread t = new Thread(theJob);
		t.start();
		System.out.println("back in main");
>>>>>>> branch 'master' of https://github.com/mafiaazul/Head-First-Java.git
	}
}
