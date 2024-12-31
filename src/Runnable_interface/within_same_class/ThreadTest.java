package Runnable_interface.within_same_class;

import Runnable_interface.seperate_class.MyRunnable;

public class ThreadTest implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("Thread 0 is running");
        }
    }
    public static void main(String[] args) {
        MyRunnable test = new MyRunnable();
        Thread t = new Thread(test);
        t.start();
        while (true) {
            System.out.println("Main thread is running");
        }
    }
}
