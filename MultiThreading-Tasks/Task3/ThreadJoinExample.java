package tasks.multithreading;

public class ThreadJoinExample {

    static class Thread1 extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread1: " + i);
                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    System.out.println("Thread1 interrupted");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); 

        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Main thread done");
    }
}
