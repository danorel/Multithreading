package dev.multitasks;

public class Thread_one extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Calculated by thread_one!");
    }
}
