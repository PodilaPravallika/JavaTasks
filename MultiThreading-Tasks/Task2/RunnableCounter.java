package tasks.multithreading;

public class RunnableCounter implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunnableCounter counter = new RunnableCounter(); // Create Runnable object
        Thread thread = new Thread(counter);             // Pass it to a Thread
        thread.start();                                  // Start the thread
    }
}

