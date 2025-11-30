import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//
//        result = Math.pow(2,5);
//        result = Math.sqrt(9);
//        result = Math.round(3.14);
//        result = Math.ceil(3.14);
//        result = Math.floor(3.99);
//        result = Math.max(10,20);
//        result = Math.min(10,20);
//        System.out.println(result);

//        Hypotenuse c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.println("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println("The hyp (side c) is: " + c + "cm");
        System.out.printf("The hyp (side c) is: %.2fcm " , c);

        scanner.close();

    }
}
