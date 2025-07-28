package tasks.multithreading;

public class MyPrinterThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from Thread!");
            try {
                Thread.sleep(1000); // Delay of 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }
    }

    public static void main(String[] args) {
        MyPrinterThread thread = new MyPrinterThread();
        thread.start(); // Start the thread
    }
}

