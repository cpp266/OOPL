import java.util.*;

class Book {
    int id;
    String title;
    boolean isIssued;
    static int totalBooks = 0;

    // Constructor
    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.isIssued = false;
        totalBooks++;
    }

    void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book already issued.");
        }
    }

    void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not issued.");
        }
    }

    void display() {
        System.out.println("ID: " + id + " | Title: " + title +
                " | Status: " + (isIssued ? "Issued" : "Available"));
    }

    static void showTotalBooks() {
        System.out.println("Total Books in Library: " + totalBooks);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> library = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. View Books");
            System.out.println("5. Total Book Count");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    Book b = new Book(id, title);
                    library.add(b);

                    System.out.println("Book added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    boolean foundIssue = false;

                    for (Book book : library) {
                        if (book.id == issueId) {
                            book.issueBook();
                            foundIssue = true;
                            break;
                        }
                    }

                    if (!foundIssue) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    boolean foundReturn = false;

                    for (Book book : library) {
                        if (book.id == returnId) {
                            book.returnBook();
                            foundReturn = true;
                            break;
                        }
                    }

                    if (!foundReturn) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    for (Book book : library) {
                        book.display();
                    }
                    break;

                case 5:
                    Book.showTotalBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}