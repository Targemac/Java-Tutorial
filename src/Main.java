import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//for loop = execute a certain amount of times

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter how many times you want to loop: ");
//        int max = scanner.nextInt();

//        for (int i = 1; i <= max; i++) {
//            System.out.printf("%d Hey\n", i);
//        }

        int start = 10;

        for (int i = start; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");

//        scanner.close();
    }
}
