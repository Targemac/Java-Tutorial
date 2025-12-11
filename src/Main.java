import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Exception = an event that interrupts the normal flow of a program
         * (dividing by zero, file not found, mismatch input type)
         * surround any dangerous code wih a try{} block
         * try(), catch{}. finally{}
         *
         * */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("that wasnt a number");
        } catch (ArithmeticException e) {
            System.out.println("You cant divide by zero");
        } catch (Exception e) {//catch all exceptions
            System.out.println("Something went wrong");
        } finally {
            System.out.println("this always executes");
        }

    }
}
