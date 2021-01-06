package com.raj.nola.threads;

public class ConcurrentThreads implements Runnable {

    public static void main(String[] args) {
        Runnable runnable = new ConcurrentThreads();

        System.out.println("Start of Main Thread");
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.setName("Thread " + i);
            thread.start();
        }
        System.out.println("End of Main Thread");
    }

    @Override
    public void run() {
        System.out.printf("I'm running in thread %s \n", Thread.currentThread().getName());
    }
}
