public class Car {

    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.66;
    boolean isRunning = false;

    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }

    void drive() {
        System.out.printf("You drive the %s", model);
    }

    void brake() {
        System.out.printf("You break the %s", model);
    }
}
