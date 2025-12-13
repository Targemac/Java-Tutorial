public class Main {
    public static void main(String[] args) {
        /*
         * Generics = a concept where you write a class, interface or method
         * that is compatible with different data types.
         *
         * <T> type parameter (placeholder that gets replaces with a real type)
         * <String> type argument (specifies the type)
         *
         * */

        Box<String> box1 = new Box<>();
        box1.setItem("banana");
        System.out.println(box1.getItem());

        Box<Integer> box2 = new Box<>();
        box2.setItem(356);
        System.out.println(box2.getItem());

        Product<String, Double> product1 = new Product<>("book", 56.3);
        Product<String, Integer> product2 = new Product<>("book", 30);

        System.out.println(product1.getItem());
        System.out.println(product2.getPrice());
    }
}
