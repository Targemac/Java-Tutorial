import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//array = a collection of values of the same type

        String[] fruits = {"apple", "orange", "banana"};

        fruits[0] = "boy"; //changing the element in an array

        int numOfFruits = fruits.length;

//        for (int i = 0; i < numOfFruits; i++) {
//            System.out.print(fruits[i] + " ");
//        }

//        array methods
        Arrays.sort(fruits);
        Arrays.fill(fruits, "cake");

//        enhanced for-loops
        for (String fruit : fruits) {
            System.out.println(fruit);
        }


    }
}
