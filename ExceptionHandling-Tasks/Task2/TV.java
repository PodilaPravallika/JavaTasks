package tasks.exceptionhandling;

interface RemoteControl {
    void turnOn(); 

    default void batteryStatus() {
        System.out.println("Battery Status: Working mode");
    }
}

public class TV implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("TV is now ON.");
    }

    public static void main(String[] args) {
        TV tv = new TV();  

        tv.turnOn();         
        tv.batteryStatus();  
    }
}
