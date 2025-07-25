package tasks.oops;

interface Logger
{
	default void logInfo()
	{
		System.out.println("Interface is started");
	}
	
	static void logError()
	{
		System.out.println("This is the static method in Interface");
	}
}
public class AppLogger implements Logger{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppLogger log = new AppLogger();
		log.logInfo();
		Logger.logError();
	}

}
