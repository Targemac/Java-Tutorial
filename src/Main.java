public class Main {
    public static void main(String[] args) {

        //        overloaded constructors = allow a class to have multiple constructors with different parameter list
        //        enable objects to be enables in various ways


        User user1 = new User("boy123");
        User user2 = new User("newGuy", "newguy@mail.com");
        User user3 = new User("stacy", "stacy@mail.com", 23);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
