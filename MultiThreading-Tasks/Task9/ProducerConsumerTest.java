package tasks.multithreading;
class Buffer
{
	private int item;
	private boolean isFull = false;
	
	public synchronized void producer(int value)
	{
		while(isFull)
		{
			try
			{
				wait();
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		item = value;
		System.out.println("Produced : "+item);
		isFull = true;
		notify();
	}
	
	public synchronized void consume()
	{
		while(!isFull)
		{
			try
			{
				wait();
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println("Consumed : "+item);
		isFull = false;
		notify();
	}
}

class Producer extends Thread
{
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			buffer.producer(i);
			try {
				Thread.sleep(500);
			} catch(InterruptedException ex)
			{
				ex.printStackTrace();
			}
		}
	}
	
}

class Consumer extends Thread
{
	private Buffer buffer;

	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			buffer.consume();
			try
			{
				Thread.sleep(800);
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class ProducerConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buffer buffer = new Buffer();
		
		Producer producer = new Producer(buffer);
		Consumer consumer = new Consumer(buffer);
		
		producer.start();
		consumer.start();
	}

}
