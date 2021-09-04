package project10.groupSolution;

public class Reference extends Book{

    public Reference(){}

    public Reference(String title, String author) {
        super(title, author);
        bookId = "9" + setBookID();
        inStock = true;
        status = isBorrowed();
    }
}
