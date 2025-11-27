

public class Main {
    public static void main(String[] args){
//        Primitive vs  Reference
//        ---------     ---------
//        int           string
//        double        array
//        char          object
//        boolean

//        -- steps to creating a variable --
//  1. declaration
//  2.assignment

        int age =21;
        int year = 2025;
        int quantity = 1;
        System.out.println(age + year + quantity);
        System.out.println("The year is " + year);

        double price = 19.35;
        double gpa = 3.5;
        double temperature = -12.6;
        System.out.println("$" + price);
        System.out.println("The temperature is " + temperature);

        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(currency);

        boolean isStudent = true;
        boolean forSale = true;
        boolean isOnline = true;
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student");
        }else {
            System.out.println("You are not a student");

        }

        String name = "charles targema";
        String email = "charles@mail.com";
        System.out.println("Hello " + name + ", your email is : " + email);


    }
}
