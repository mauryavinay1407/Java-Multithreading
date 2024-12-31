package Runnable_interface.seperate_class;

public class Main {
    public static void main(String[] args){
        MyRunnable test = new MyRunnable();
        Thread t = new Thread(test);
        t.start();
        while(true){
            System.out.println("Main thread is running");
        }
    }
}
