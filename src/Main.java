public class Main {
    public static void main(String[] args) {

        //        .toString() = method inherited from the Object class.
        //        used to return a string representation of an object
        //        by default, it returns a hash code as a unique identifier.
        //        it can be overridden to provide meaningful details


        Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Chevrolet", "corvette", 2029, "Blue");


        System.out.println(car1);
        System.out.println(car2);
    }
}
