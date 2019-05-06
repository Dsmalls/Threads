package com.section15;

import static com.section15.ThreadColor.ANSI_GREEN;

// Using an Runnable interface
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_GREEN + "My Runnable is now in the mix....");

    }
}
