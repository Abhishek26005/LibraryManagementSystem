
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    private final Map<Integer, Book> books = new HashMap<>();
    private final Map<Integer, Member> members = new HashMap<>();
    private final Map<Integer, Integer> issuedBooks = new HashMap<>();

    public void addBook(int id, String title, String author) {
        if (id <= 0 || title == null || title.trim().isEmpty()
                || author == null || author.trim().isEmpty()) {
            System.out.println("Invalid book details.");
            return;
        }

        if (books.containsKey(id)) {
            System.out.println("Book ID already exists.");
            return;
        }

        books.put(id, new Book(id, title.trim(), author.trim()));
        System.out.println("Book added successfully!");
    }

    public void registerMember(int id, String name) {
        if (id <= 0 || name == null || name.trim().isEmpty()) {
            System.out.println("Invalid member details.");
            return;
        }

        if (members.containsKey(id)) {
            System.out.println("Member ID already exists.");
            return;
        }

        members.put(id, new Member(id, name.trim()));
        System.out.println("Member registered successfully!");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.printf("%-8s %-25s %-20s %-12s%n",
                "Book ID", "Title", "Author", "Status");

        for (Book book : books.values()) {
            book.display();
        }
    }

    public void searchBook(String keyword) {
        boolean found = false;

        for (Book book : books.values()) {
            if (book.getTitle().toLowerCase()
                    .contains(keyword.toLowerCase())
                    || String.valueOf(book.getBookId())
                    .equals(keyword)) {
                book.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching book found.");
        }
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No registered members.");
            return;
        }

        for (Member member : members.values()) {
            member.display();
        }
    }

    public void issueBook(int bookId, int memberId) {
        Book book = books.get(bookId);
        Member member = members.get(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (book.isIssued()) {
            System.out.println("Book is already issued.");
            return;
        }

        book.issue();
        issuedBooks.put(bookId, memberId);

        System.out.println("Book issued successfully to "
                + member.getName() + "!");
    }

    public void returnBook(int bookId, int memberId) {
        Book book = books.get(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!book.isIssued()
                || !Integer.valueOf(memberId).equals(
                        issuedBooks.get(bookId))) {
            System.out.println(
                    "No matching issued book found for this member.");
            return;
        }

        book.returnBook();
        issuedBooks.remove(bookId);

        System.out.println("Book returned successfully!");
    }

    public void displayIssuedBooks() {
        if (issuedBooks.isEmpty()) {
            System.out.println("No books are currently issued.");
            return;
        }

        System.out.println("\n----- ISSUED BOOKS -----");

        for (Map.Entry<Integer, Integer> entry
                : issuedBooks.entrySet()) {
            Book book = books.get(entry.getKey());
            Member member = members.get(entry.getValue());

            System.out.println("Book: " + book.getTitle()
                    + " | Member: " + member.getName());
        }
    }
}
