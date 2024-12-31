package using_thread_class.within_same_class;

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
