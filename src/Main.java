import java.util.Random;

public class Main {
    public static void main(String[] args){

       Random random = new Random();

       int number1;
       double number2;
       int number3;

       number1 = random.nextInt(1,101);
       number2 = random.nextDouble(1,101);
       number3 = random.nextInt(1,101);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

    }
}
