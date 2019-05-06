package com.section15;

import static com.section15.ThreadColor.ANSI_BLUE;
import static com.section15.ThreadColor.ANSI_RED;

public class AnotherThreadEx extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Another thread " + currentThread().getName());

        // added a try catch, and the thread will only sleep for 3secs
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            System.out.println(ANSI_BLUE + "Another thread woke me up!");
            return; // terminates another thread instance
        }

        System.out.println(ANSI_BLUE + "Five secs have passed and I'm up");
    }
}
