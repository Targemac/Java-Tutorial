import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        /*
         * Timer = Class that schedules tasks at specific times or periodically useful for: sending
         * notifications, scheduled updates, repetitive actions
         *
         * TimerTask = represents the task that will be exceuted by the Timer
         * you will extend the TimerTask class to define the task
         * create a subclass of TimerTask and @Overrider run()
         * */

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello");
                count--;
                if (count == 0) {
                    System.out.println("Task complete!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
