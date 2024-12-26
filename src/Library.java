public class Library {
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
