import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//ENHANCED SWITCHES

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the day of the week: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday",
                 "Tuesday",
                 "Wednesday",
                 "Thursday",
                 "Friday" -> System.out.println("Its a weekday 😊");
            case "Saturday",
                 "Sunday" -> System.out.println("Its a weekend ❤️");
            default -> System.out.println(day + " is not a day!");
        }

    }
}
