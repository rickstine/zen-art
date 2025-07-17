package Multithreading;

class CustomThread extends Thread {
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println(getName() + ": " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class Demo3 {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread();
        t1.setName("Worker");
        t1.start();
    }
}
