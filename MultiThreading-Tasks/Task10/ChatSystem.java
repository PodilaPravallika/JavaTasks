package tasks.multithreading;
class Chat
{
	boolean isSenderTurn = true;
	
	public synchronized void send(String msg)
	{
		while(!isSenderTurn)
		{
			try
			{
				wait();
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Sender : "+msg);
		isSenderTurn = false;
		notify();
	}
	
	public synchronized void receive(String msg)
	{
		while(isSenderTurn)
		{
			try
			{
				wait();
			} catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Recevier : "+msg);
		isSenderTurn = true;
		notify();
	}
}

class Sender extends Thread
{
	Chat chat;
	String[] messages = {"Hi","How are you?","What are you doing?","Bye"};
	
	public Sender(Chat chat) {
		this.chat = chat;
	}
	
	public void run()
	{
		for(String msg : messages)
		{
			chat.send(msg);
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

class Recevier extends Thread
{
	Chat chat;
	String[] messages = {"Hello","I'm fine.","Learning java threads","Bye"};
	
	public Recevier(Chat chat) {
		this.chat = chat;
	}
	
	public void run()
	{
		for(String msg: messages)
		{
			chat.receive(msg);
			
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

public class ChatSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chat chat = new Chat();
		new Sender(chat).start();
		new Recevier(chat).start();
	}
}
