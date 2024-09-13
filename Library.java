import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Book added successfully!");
    }

    public void listBooks() {
        if (catalog.isEmpty()) {
            System.out.println("No books in the catalog.");
        } else {
            for (Book book : catalog) {
                System.out.println(book);
            }
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with title: " + title);
        }
    }

    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : catalog) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by author: " + author);
        }
    }
}
