public class Main {
    public static void main(String[] args) {
//overloaded methods = methods that share the same name, but different parameters
//        signature = name  + parameters

        String cakeResult = bakeCake("flat cake", "someer");

        System.out.println(cakeResult);
    }

    static double add(double a, double b) {
        return a + b;
    }

    static double add(double a, double b, double c) {
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d;
    }

    static String bakeCake(String bread) {
        return bread + " cake";
    }

    static String bakeCake(String bread, String cheese) {
        return cheese + " " + bread + " cake";
    }
}
