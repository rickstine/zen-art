package Multithreading;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running...");
    }

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t1 = new Thread(myRunnable);
        t1.start();


    }
}
