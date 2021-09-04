package project10.groupSolution;

public class Fiction extends Book {

    public Fiction(){}

    public Fiction(String title, String author) {
        super(title, author);
        bookId = "1" + setBookID();
        inStock = true;
        status = isBorrowed();
    }
}
