package com.section15;

import static com.section15.ThreadColor.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "This is the main thread");

        // creating an instance of a thread
        Thread anotherThreadex = new AnotherThreadEx();
        anotherThreadex.setName("== is now Responding... ==");
        // invoking the run method
        anotherThreadex.start();

        // Running a thread as an anonymous class
        new Thread(() -> System.out.println(ANSI_CYAN + "Anonymous is now mysteriously responding... ")).start();

        // creating a new thread based on MyRunnable
        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_GREEN + "Anonymous is implementing");
                try {
                    anotherThreadex.join(2000); // calling a join method, joining to AnotherThreadex...overloading the method
                    System.out.println(ANSI_RED + "AnotherThreadex terminated or timed out");
                } catch (InterruptedException e){
                    System.out.println(ANSI_RED + "I couldn't wait...I was rudely interrupted");
                }
            }
        });

        myRunnableThread.start();
        // anotherThreadex.interrupt(); , zombie code

        System.out.println(ANSI_BLUE + "Main thread is back again...");
    }
}
