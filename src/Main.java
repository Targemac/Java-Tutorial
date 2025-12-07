public class Main {
    public static void main(String[] args) {

        /*
         * They help protect object data and add rules for accessing or modifying them.
         * GETTERS = methods that make a field readable
         * SETTERS = methods that make a field writeable
         * */

        Car car = new Car("Charger", "Yellow", 10000);
        car.setColor("white");
        car.setPrice(-6533);
        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
