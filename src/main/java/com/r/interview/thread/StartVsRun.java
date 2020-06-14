package com.r.interview.thread;

public class StartVsRun extends Thread{


    @Override
    public void run() {
        System.out.println("Hello gets printed  " + currentThread().getName());
    }

    public static void main(String[] args) {
        StartVsRun obj = new StartVsRun();

        obj.start();//new thread
        obj.run();// same thread
        
    }
}
