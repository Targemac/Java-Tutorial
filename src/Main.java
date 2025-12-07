public class Main {
    public static void main(String[] args) {

        /*
         * Interface = a blueprint for a class that specifies a set of abstract methods that implementing clsses must define.
         * supports multiple inheritance-like behaviour.
         *
         * a class can implement multiple interfaces
         * */


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();

    }
}
