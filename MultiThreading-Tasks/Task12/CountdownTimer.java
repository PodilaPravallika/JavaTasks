package tasks.multithreading;
class CountdownThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=10;i>=1;i--)
			{
				System.out.println("Countdown : "+i);
				Thread.sleep(1000);
			}
			System.out.println("Time is up");
		} catch(InterruptedException e)
		{
			System.out.println("Countdown interrupted!");
		}
	}
}

public class CountdownTimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountdownThread  timer = new CountdownThread();
		timer.start();
	}

}
