public class RyanAndMonicaJob implements Runnable {
	
	private BankAccount account = new BankAccount();
	
	private static void main (String[] args) {
		RyanAndMonicaJob theJob = new RyanAndMonicaJob();
		Thread one = new Thread (theJob);
		Thread two = new Thread (theJob);
		one.setName("Ryan");
		two.setName("Monica");
		one.start();
		two.start();		
	}
	
	public void run() {
		for (int x = 0; x < 10; x++) {
			makeWithdraw1(10);
			if (account.getBalance() < 0) {
				System.out.println("Overdrawn");
			}
		}
	}
}