import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Threading = allows a program to run multiple tasks simultaneously
         * helps improve perfomrance with time-consumeing operations
         * (File I/O, network communications, or any background tasks)
         * */

        //        how to create a thread
        //        option 1. extend the thread class
        //        option 2. implement the runnable interface (better)

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5s to enter your name!");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);//this thread would end as soon as the main thread is finished
        thread.start();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.printf("\nHello %s", name);

        scanner.close();
    }
}
