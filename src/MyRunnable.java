<<<<<<< HEAD
public class MyRunnable implements Runnable {
	
	public void run() {
		go();
	}
	
	public void go() {
		doMore();
	}
	
	public void doMore() {
		System.out.println("Top o' the stack");
	}
}
=======

public class MyRunnable implements Runnable {
	
	public void run() {
		go();
	}
	
	public void go() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		
		doMore();
	}
	
	public void doMore() {
		System.out.println("top o' the stack");
	}
}
>>>>>>> branch 'master' of https://github.com/mafiaazul/Head-First-Java.git
