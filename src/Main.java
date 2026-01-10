public class Main {
    public static void main(String[] args) {

        //        inheritance = one class inherits the attributes and methods from another class.
        //        Child <- Parent <- GrandParent

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();

        dog.speak();
        cat.speak();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.photosynthesis();
        System.out.println(plant.isAlive);


    }
}
