package com.r.interview.thread;

import com.sun.jdi.event.ThreadStartEvent;

public class ThreadCannotBeStartedTwice  extends Thread {


    @Override
    public void run() {
        System.out.println("Hello gets printed once  " + currentThread().getName() +" "
        + currentThread().getState());
    }

    public static void main(String[] args) {
        ThreadCannotBeStartedTwice obj = new ThreadCannotBeStartedTwice();

        obj.start();
        obj.start();
    }
}
