package tasks.multithreading;

class BankAccount
{
	private int balance = 1000;
	
	public synchronized void withdraw(int amount, String user)
	{
		if(balance>=amount)
		{
			System.out.println(user +" is trying to withdraw "+ amount);
			try
			{
				Thread.sleep(500);
			} catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
			balance = balance - amount;
			System.out.println(user +" successfully withdrawn "+amount);
		}
		else
		{
			System.out.println(user + " failed to withdraw "+amount);
		}
		System.out.println("Remaining balance : "+balance);
	}
}

class UserThread extends Thread
{
	private BankAccount account;
	private int amount;
	private String user;
	
	public UserThread(BankAccount account, int amount, String user) {
		this.account = account;
		this.amount = amount;
		this.user = user;
	}
	
	public void run()
	{
		account.withdraw(amount, user);
	}
}

public class BankSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		
		UserThread user1 = new UserThread(account,300,"user1");
		UserThread user2 = new UserThread(account,700,"user2");
		
		user1.start();
		user2.start();
		
	}

}
