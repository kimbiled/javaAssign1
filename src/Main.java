public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        LibraryMember member1 = new LibraryMember("Alice", "M001");
        LibraryMember member2 = new LibraryMember("Bob", "M002");

        Library library = new Library("Central Library", 5, 5);

        // Adding books and members to the library
        library.addBook(book1, 0);
        library.addBook(book2, 1);
        library.addMember(member1, 0);
        library.addMember(member2, 1);

        library.displayLibraryInfo();

        if (book1.equals(book2)) {
            System.out.println("The books are identical.");
        } else {
            System.out.println("The books are different.");
        }
    }
}
