public class Main {
    public static void main(String[] args) {

        //        static = makes a variable or method belong to a class, rather than to any specific object.
        //        commonly used for utility methods or shared resources


        Friend friend1 = new Friend("kate");
        Friend friend2 = new Friend("patrick");
        Friend friend3 = new Friend("ola");
        Friend friend4 = new Friend("kelly");

        System.out.println(Friend.numOfFriends);
        Friend.showFriends();

    }
}
