public class Main {

    static int x = 3;//class scope


    public static void main(String[] args) {

        int x = 1;//Local scope
        doSomething();

    }

    static void doSomething() {
//        int x = 2;//local scope

        System.out.println(x);
    }
}
