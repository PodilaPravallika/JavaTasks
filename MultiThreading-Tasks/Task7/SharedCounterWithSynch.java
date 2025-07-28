package tasks.multithreading;
class SharedCounter
{
	private int count = 0;
	
	public void increment()
	{
		synchronized (this) 
		{
			count++;
		}
	}
	
	public int getCount()
	{
		return count;
	}
}

class CounterThread1 extends Thread
{
	SharedCounter counter;
	
	public CounterThread1(SharedCounter counter)
	{
		this.counter = counter;
	}
	
	public void run()
	{
		for(int i=0;i<1000;i++)
		{
			counter.increment();
		}
	}
}

public class SharedCounterWithSynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedCounter counter = new SharedCounter();
		
		CounterThread1 t1 = new CounterThread1(counter);
		CounterThread1 t2 = new CounterThread1(counter);
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();
			t2.join();
		} catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("Final Counter value : "+counter.getCount());
	}

}
