package using_thread_class.seprate_class;

public class Main {
    public static void main(String[] args){
        MyThread t = new MyThread();
        t.start();
        int i=0;
        while(true) {
            System.out.println(i + " Hello");
            i++;
        }
//        System.out.println(Thread.currentThread().getName());
        }
    }

