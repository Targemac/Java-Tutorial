import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
//       if statement

        String name;
        int age;
        boolean isStudent;

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.println("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();

//        GROUP 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name!");
        }else{
            System.out.println("Hello " + name + "!");
        }




//        GROUP 2
        if(age >= 18){
            System.out.println("You are an adult");
        } else if (age >= 65) {
            System.out.println("You are a senior");
        } else if (age <0) {
            System.out.println("You have not been born yet");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else{
            System.out.println("You are a child");
        }

//        group 3
        if(isStudent){
            System.out.println("you are a student");
        }else {
            System.out.println("you are not a student");
        }

        scanner.close();
    }
}
