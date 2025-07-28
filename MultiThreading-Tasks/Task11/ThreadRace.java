package tasks.multithreading;
class RaceParticipant extends Thread
{

	public RaceParticipant(String name) 
	{
		this.setName(name);
	}
	
	public void run()
	{
		for(int i=2;i<=5;i++)
		{
			System.out.println(getName()+ " is running..");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch(InterruptedException e)
			{
				System.out.println(getName() + " was interrupted");
			}
		}
	}
	
}
public class ThreadRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RaceParticipant participant1 = new RaceParticipant("Pravallika");
		RaceParticipant participant2 = new RaceParticipant("Sai Niharika");
		RaceParticipant participant3 = new RaceParticipant("Kavya");
		
		participant1.start();
		participant2.start();
		participant3.start();

	}

}
