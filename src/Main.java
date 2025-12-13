import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        /*
         * Hashmap = a data structure that stores key-value pairs
         * keys are unique, but values can be duplicated
         * does not maintain any other, but is memory efficient
         * HashMap<key, value>
         * */

        HashMap<String, Double> map = new HashMap<>();
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.69);

        //        map.remove("apple");

        System.out.println(map);
        System.out.println(map.get("apple"));
        System.out.println(map.containsKey("apple"));

        if (map.containsKey("orange")) {
            System.out.println(map.get("orange"));
        } else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(0.75));

        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key + " : NGN" + map.get(key));
        }
    }
}
