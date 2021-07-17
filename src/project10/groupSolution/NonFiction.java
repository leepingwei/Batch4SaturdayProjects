package project10.groupSolution;

public class NonFiction extends Book{

    public NonFiction(){}

    public NonFiction(String title, String author) {
        super(title, author);
        bookId = "2" + setBookID();
        inStock = true;
        status = isBorrowed();
    }
}
