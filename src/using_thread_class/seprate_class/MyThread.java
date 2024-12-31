package using_thread_class.seprate_class;

public class MyThread extends Thread{
    @Override
    public void run() {
        int i=0;
        while(true) {
            System.out.println(i + " World");
            i++;
        }
//        System.out.println(Thread.currentThread().getName());
        }
    }
