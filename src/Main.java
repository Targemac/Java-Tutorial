import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        &&    AND
//        ||    OR
//        !     NOT

        Scanner scanner = new Scanner(System.in);

        double temp = 20;
        boolean isSunny = false;

        if (temp <= 30 && temp >= 0 && isSunny) {
            System.out.println("The weather is good");
        } else if (temp <= 30 && temp >= 0 && !isSunny) {
            System.out.println("Cloudy");
        }

        String username;
        System.out.print("Enter your username: ");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain space or underscore");
        } else {
            System.out.printf("Welcome %s", username);
        }

        scanner.close();

    }
}
