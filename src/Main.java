import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
//        to read a string
        String name = scanner.nextLine();// this reads a string of characters including spaces
        System.out.println("Hello " + name);

//        to read an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("You are: " + age + " years old");

//        to read a double
        System.out.print("What is your GPA ?");
        double gpa = scanner.nextDouble();
        System.out.println("Your gpa is: " + gpa);

//        to read a boolean
        System.out.print("Are you a student ? (true/false)");
        boolean isStudent = scanner.nextBoolean();
        if(isStudent){
        System.out.println("you are a student");
        }else{
            System.out.println("you are not a student");
        }

//        common issue
//fix issues with calling scanner.nextLine() method

        scanner.close();
    }
}
