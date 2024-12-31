package Runnable_interface.seperate_class;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Thread 0 is running");
        }
    }
}
