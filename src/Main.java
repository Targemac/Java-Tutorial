import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Enums = (Enumerations) a special kind of class that represents a fixed set of c
         * constants.
         * They improve code readability and are easy to maintain.
         * more efficient with switches when comparing strings
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week: ");
        String response = scanner.nextLine().toUpperCase();

        try {

            Day day = Day.valueOf(response);
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It is a weekday!");
                default -> System.out.println("It is the weekend!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid day!");
        }

        scanner.close();
    }
}
