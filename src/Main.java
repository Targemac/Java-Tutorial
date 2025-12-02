import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

//        DECLARE VARIABLES
        double weight;
        double newWeight;
        int choice;

//        WELCOME MESSAGE
        System.out.println("Weight conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

//        PROMPT FOR USER CHOICE
        System.out.print("\nChoose an option: ");
        choice = scanner.nextInt();


        if (choice == 1) {
//        OPTION 1: CONVERT LBS TO KGS
            System.out.print("Enter the weight in  in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f\n", newWeight);
        } else if (choice == 2) {
//        OPTION 2: CONVERT KGS TO LGS
            System.out.print("Enter the weight in  in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f\n", newWeight);
        } else {
            System.out.println("That was nota valid choice");
        }


//        ELSE: PRINT : NOT A VALID CHOICE

        scanner.close();

    }
}
