package project10.solution;

import project10.solution.Books.Book;
import project10.solution.Books.Fiction;
import project10.solution.Books.NonFiction;
import project10.solution.Books.Reference;
import project10.solution.Users.Librarian;
import project10.solution.Users.Student;
import project10.solution.Users.Teacher;
import project10.solution.Users.User;

import java.util.HashMap;
import java.util.Map;

public class Data {

    private static Map<Integer, User> userMap = new HashMap<>();

    private static Map<Integer, Book> bookMap = new HashMap<>();

    static {
        addUser(new Librarian("Library", "Admin", 1000));
        addUser(new Librarian("Book", "Keeper", 1001));
        addUser(new Teacher("David", "Johnson", 2000));
        addUser(new Teacher("Ali", "Veli", 2001));
        addUser(new Teacher("Cool", "Teacher", 2002));
        addUser(new Student("Mariam", "Bookworm", 3000));
        addUser(new Student("Chen", "Yang", 3001));
        addUser(new Student("Alex", "Glazkov", 3002));

        addBook(new Fiction("Fiction Book 1", "Author - 1",10000));
        addBook(new Fiction("Fiction Book 2", "Author - 2",10001));
        addBook(new Fiction("Fiction Book 1", "Author - 1",10002));
        addBook(new NonFiction("Non-fiction Book 1", "Author - 3",20000));
        addBook(new NonFiction("Non-fiction Book 2", "Author - 5",20001));
        addBook(new NonFiction("Non-fiction Book 3", "Author - 1",20002));
        addBook(new Reference("Reference Book 1", "Author - 10",90000));
        addBook(new Reference("Reference Book 2", "Author - 10",90001));
    }

    private Data(){} // For ensuring Data class not to be instantiated.

    public static void addUser(User user) {
        userMap.put(user.getUserId(), user);
    }

    public static void addBook(Book book) {
        bookMap.put(book.getBookId(), book);
    }

    public static Map<Integer, User> getUserMap() {
        return userMap;
    }

    public static Map<Integer, Book> getBookMap() {
        return bookMap;
    }
}
