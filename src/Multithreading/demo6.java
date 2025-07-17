package Multithreading;

class Message {
    String content;
}
public class demo6 {
    public static void main(String[] args) {
        Message message = new Message();
        Thread waiter = new Thread(() -> {
            synchronized (message) {
                try {
                    System.out.println("Waiting for message...");
                    message.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Message received: " + message.content);
            }
        });
        Thread notifier = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
            synchronized (message) {
                message.content = "Hello from Thread!";
                message.notify();
                System.out.println("Message delivered.");
            }
        });
        waiter.start();
        notifier.start();
    }
}

