package academy.learning;

import static academy.learning.ThreadColor.ANSI_GREEN;
import static academy.learning.ThreadColor.ANSI_PURPLE;
import static academy.learning.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();


        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
                try {
                    System.out.println(ANSI_RED + "... join ...");
                    anotherThread.join();
                    System.out.println(ANSI_RED + "join OK");
                    System.out.println(ANSI_RED + "Another Thread terminated or timed out, so i'm running again");
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + " I couldn't wait after all, i was interrupted");
                }
            }
        });

        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE+"Hello again from the main thread.");


    }
}
