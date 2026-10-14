
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    private static final Library library = new Library();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n================================");
            System.out.println("   LIBRARY MANAGEMENT SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Register Member");
            System.out.println("5. View Members");
            System.out.println("6. Issue Book");
            System.out.println("7. Return Book");
            System.out.println("8. View Issued Books");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = readInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    library.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter book ID or title: ");
                    library.searchBook(sc.nextLine().trim());
                    break;
                case 4:
                    registerMember();
                    break;
                case 5:
                    library.displayMembers();
                    break;
                case 6:
                    System.out.print("Enter book ID: ");
                    int issueId = readInt();
                    System.out.print("Enter member ID: ");
                    int issueMember = readInt();
                    library.issueBook(issueId, issueMember);
                    break;
                case 7:
                    System.out.print("Enter book ID: ");
                    int returnId = readInt();
                    System.out.print("Enter member ID: ");
                    int returnMember = readInt();
                    library.returnBook(returnId, returnMember);
                    break;
                case 8:
                    library.displayIssuedBooks();
                    break;
                case 9:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);

        sc.close();
    }

    private static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid number: ");
            sc.next();
        }

        int value = sc.nextInt();
        sc.nextLine();
        return value;
    }

    private static void addBook() {
        System.out.print("Enter book ID: ");
        int id = readInt();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        library.addBook(id, title, author);
    }

    private static void registerMember() {
        System.out.print("Enter member ID: ");
        int id = readInt();

        System.out.print("Enter member name: ");
        String name = sc.nextLine();

        library.registerMember(id, name);
    }
}
