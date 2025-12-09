import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * ArrayList = a resizable array that stores objects (autoboxing).
         *              Arrays are fixed in size, but ArrayLists can change
         * */

        //        ArrayList<Integer> list1 = new ArrayList<>();
        //        ArrayList<Double> list2 = new ArrayList<>();
        //        ArrayList<String> fruits = new ArrayList<>();
        //
        //        list1.add(3);
        //        list1.add(4);
        //        list1.add(1);
        //
        //        list2.add(3.25);
        //        list2.add(3.64);
        //        list2.add(7.65);
        //
        //        fruits.add("apple");
        //        fruits.add("mango");
        //        fruits.add("orange");
        //
        //        //        fruits.remove(0);
        //        fruits.set(0, "pipeline");
        //        Collections.sort(fruits);
        //
        //        System.out.println(list1);
        //        System.out.println(list2);
        //        System.out.println(fruits.get(1));
        //        System.out.println(fruits.size());
        //
        //        for (String fruit : fruits) {
        //            System.out.println(fruit);
        //        }


        
        /*
         ***************************************
         ***************************************
         ***************************************
         ***************************************
         * */
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the # of food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);

        }

        System.out.println(foods);

        scanner.close();
    }
}
