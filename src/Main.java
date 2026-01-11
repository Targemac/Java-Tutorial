public class Main {
    public static void main(String[] args) {

//        methods = a block of reusable code that is executed when called

        String name = "Charles";
        int age = 19;

//        String birthdayResult = happyBirthday(name, age);
        double squareResult = square(3);
        double cubeResult = cube(3);
        String fullNameResult = getFullName("Ben", "Sima");
        boolean ageResult = ageCheck(25);

        System.out.println(ageResult);

    }

    static void happyBirthday(String name, int age) {
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("you are %d years old!\n", age);
        System.out.println("Happy birthday to you!");
    }

    static double square(double number) {
        return number * number;
    }

    static double cube(double number) {
        return number * number * number;
    }

    static String getFullName(String first, String last) {
        return first + " " + last;
    }

    static boolean ageCheck(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
