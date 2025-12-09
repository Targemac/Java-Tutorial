public class Main {
    public static void main(String[] args) {

        /*
         * abstract = used to define abstract classes and methods.
         * abstraction is the process of hiding implementation details and showing
         * only the essential features.
         * Abstract classes cant be instantiated directly
         * can contain abstract methods (which must be implemented by children classes)
         * can contain concrete methods (which are inherited by children classes)
         * */

        Circle circle = new Circle(6);
        Triangle trangle = new Triangle(12, 6);
        Rectangle rectangle = new Rectangle(6, 2);

        System.out.println(circle.area());
        System.out.println(trangle.area());
        System.out.println(rectangle.area());


    }
}
