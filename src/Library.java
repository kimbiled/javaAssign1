import java.util.Arrays;
class Library {
    private String libraryName;
    private Book[] books;
    private LibraryMember[] members;

    public Library(String libraryName, int maxBooks, int maxMembers) {
        this.libraryName = libraryName;
        this.books = new Book[maxBooks];
        this.members = new LibraryMember[maxMembers];
    }

    public void addBook(Book book, int index) {
        if (index >= 0 && index < this.books.length) {
            if (this.books[index] == null) {
                this.books[index] = book;
            } else {
                System.out.println("Cannot add book: " + book + " to index " + index + ".");
                System.out.println("Index " + index + " is already occupied by: " + this.books[index]);
            }
        } else {
            System.out.println("Invalid index: " + index + ".");
        }
    }

    public void addMember(LibraryMember member, int index) {
        if (index >= 0 && index < this.members.length) {
            if (this.members[index] == null) {
                this.members[index] = member;
            } else {
                System.out.println("Index " + index + " is already occupied by another member.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayLibraryInfo() {
        System.out.println("Library: " + this.libraryName);
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

    // Filtering: Find books by title
    public void searchBooksByTitle(String title) {
        System.out.println("Searching for books with title: " + title);
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
            }
        }
    }

    // Sorting books by title
    public void sortBooksByTitle() {
        Arrays.sort(books, (b1, b2) -> {
            if (b1 == null) return 1;
            if (b2 == null) return -1;
            return b1.getTitle().compareToIgnoreCase(b2.getTitle());
        });
    }
}
