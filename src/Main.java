public class Main {
    public static void main(String[] args){

//       printf() = is a method used to format output
//        %[flags][width][.precision][specifier-character]

        String name = "Charles";
        char firstLetter = 'C';
        int age = 30;
        double height = 60.3;
        boolean isEmployed = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("your name starts with a %c\n", firstLetter);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("you are %f inches tall\n", height);
        System.out.printf("Employed: %b\n", isEmployed);
        System.out.printf("%s is %d years old\n", name, age);

        double price1 = 9000.99;
        double price2 = 100000.15;
        double price3 = -50004.01;

        System.out.printf("%(+.1f\n", price1);
        System.out.printf("%(,+.2f\n", price2);
        System.out.printf("%(,+.3f\n", price3);


        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);


    }
}
