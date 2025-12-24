import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        java dice rolling program

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        declare variables
        int numOfDice;
        int total = 0;

//        get the # of dice from user
        System.out.print("Enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();


//          check if # of dice >0
        if (numOfDice > 0) {
//        roll all the dice
            for (int i = 0; i < numOfDice; i++) {
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);

                total += roll;
            }

//        get the total
            System.out.println("Total: " + total);
        } else {
            System.out.println("# of dice must be  greater than 0");
        }

//        display ASCII of dice

        scanner.close();
    }

    static void printDie(int roll) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;

        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;

        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;

        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;

        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }
    }
}
