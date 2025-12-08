public class Main {
    public static void main(String[] args) {

        /*
         * Aggregation = represents a has-a relationship between objects.
         * one object contains another object as part of its structure,
         * but the contained objects can exist independently
         * */

        Book book1 = new Book("The fellow book", 452);
        Book book2 = new Book("The other book", 425);
        Book book3 = new Book("The yello book", 427);

        Book[] books = {book1, book2, book3};

        Library library = new Library("Nigeria library", 1565, books);
        library.displayInfo();


    }
}
