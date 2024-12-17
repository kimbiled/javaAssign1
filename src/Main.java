public class Main {

    // Book class
    static class Book {
        private String title;
        private String author;
        private String isbn;

        // Constructor
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

        // Getters and Setters
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "', author='" + author + "', isbn='" + isbn + "'}";
        }
    }

    // LibraryMember class
    static class LibraryMember {
        private String name;
        private String memberId;

        // Constructor
        public LibraryMember(String name, String memberId) {
            this.name = name;
            this.memberId = memberId;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        @Override
        public String toString() {
            return "LibraryMember{name='" + name + "', memberId='" + memberId + "'}";
        }
    }

    // Library class
    static class Library {
        private String libraryName;
        private Book[] books;
        private LibraryMember[] members;

        // Constructor
        public Library(String libraryName, int maxBooks, int maxMembers) {
            this.libraryName = libraryName;
            this.books = new Book[maxBooks];
            this.members = new LibraryMember[maxMembers];
        }

        // Methods to add books and members
        public void addBook(Book book, int index) {
            if (index >= 0 && index < books.length) {
                books[index] = book;
            }
        }

        public void addMember(LibraryMember member, int index) {
            if (index >= 0 && index < members.length) {
                members[index] = member;
            }
        }

        // Method to display all books and members
        public void displayLibraryInfo() {
            System.out.println("Library: " + libraryName);
            System.out.println("Books available:");
            for (Book book : books) {
                if (book != null) {
                    System.out.println(book);
                }
            }
            System.out.println("Members:");
            for (LibraryMember member : members) {
                if (member != null) {
                    System.out.println(member);
                }
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating Book instances
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // Creating LibraryMember instances
        LibraryMember member1 = new LibraryMember("Alice", "M001");
        LibraryMember member2 = new LibraryMember("Bob", "M002");

        // Creating Library instance
        Library library = new Library("Central Library", 5, 5);

        // Adding books and members to the library
        library.addBook(book1, 0);
        library.addBook(book2, 1);
        library.addMember(member1, 0);
        library.addMember(member2, 1);

        // Display library information
        library.displayLibraryInfo();

        // Comparing books
        if (book1.equals(book2)) {
            System.out.println("The books are identical.");
        } else {
            System.out.println("The books are different.");
        }
    }
}
