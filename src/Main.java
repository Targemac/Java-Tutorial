public class Main {
    public static void main(String[] args) {

        //

        Car car1 = new Car("Mustang", "Red");
        Car car2 = new Car("corvette", "Blue");
        Car car3 = new Car("charger", "yellow");

        //        anonymous objects
        //        Car[] cars = {
        //                new Car("Mustang", "Red"),
        //                new Car("corvette", "Blue"),
        //                new Car("charger", "yellow"),
        //        };

        //                Car[] cars = new Car[3];
        Car[] cars = {car1, car2, car3};

        for (Car car : cars) {
            car.color = "black";
        }

        for (Car car : cars) {
            car.drive();
            car.color = "black";
        }

    }
}
