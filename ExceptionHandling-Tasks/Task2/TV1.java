package tasks.exceptionhandling;

interface RemoteControl1 {
    void turnOn(); 

    default void batteryStatus() {
        System.out.println("Battery Status: Working mode");
    }
    
    static void info()
    {
    	System.out.println("These are the remote control devices");
    }
}

public class TV1 implements RemoteControl1 {

    @Override
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    public static void main(String[] args) {
        TV1 tv = new TV1();  
        
        RemoteControl1.info();
        tv.turnOn();         
        tv.batteryStatus();  
    }
}

