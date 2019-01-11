package dev.multitasks;

import java.util.Date;

public class Tester {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        Thread_one thread_one = new Thread_one();
        thread_one.start();
        Thread_two thread_two = new Thread_two();
        thread_two.start();
        thread_one.join();
        thread_two.join();
        long end = System.currentTimeMillis();
        System.out.println("Difference: " + (end - begin) / 1000);
    }
}
