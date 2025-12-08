public class Main {
    public static void main(String[] args) {

        /*
         * wrapper-classes = Allow primitive values(int, char, double, boolean)
         * to be used as objects. "wrap them in an object"
         * generally, don't wrap primitives unless you need an object.
         * allows use of Collections Framework and static utility method
         * */

        //        Autoboxing
        //        Integer a = 123;
        //        Double b = 3.142;
        //        Character c = '$';
        //        Boolean d = true;
        //
        //        //        unboxing
        //        boolean x = d;

        //        String a = Integer.toString(123);
        //        String b = Double.toString(3.142);
        //        String c = Character.toString('@');
        //        String d = Boolean.toString(false);
        //
        //        String x = a + b + c + d;
        //        System.out.println(x);

        //        int a = Integer.parseInt("123");
        //        double b = Double.parseDouble("3.142");
        //        char c = "Pizza hunt".charAt(0);
        //        boolean d = Boolean.parseBoolean("true");

        char letter = 'b';
        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
