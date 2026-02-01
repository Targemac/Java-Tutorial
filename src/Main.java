import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        int[] numbers = {6, 2, 3, 7, 5, 1, 8, 9, 4};
        String[] fruits = {"apple", "orange", "banana"};

        int target1 = 10;
        boolean isFound = false;
        String target2;

        System.out.print("Enter a fruit to search for: ");
        target2 = scanner.nextLine();

//        for (int i = 0; i < numbers.length; i++) {
//            if (target1 == numbers[i]) {
//                System.out.println("Element found at index: " + i);
//                isFound = true;
//                break;
//            }
//        }

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(target2)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array!");
        }

        scanner.close();

    }
}
