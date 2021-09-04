package project10.groupSolution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {

    private String title;
    private String author;
    protected String bookId;
    static boolean inStock;
    static String status;
    static List<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Book(){}

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        inStock = true;
        setBookID();
    }

    public String setBookID(){
        int id = (int)(Math.random() * 8999) + 1000;
        return String.valueOf(id);
    }

    public String toString() {
        return "title:\t" + "<<" + title + ">>" +
                "\nauthor:\t" + author +
                "\nbookId:\t" + bookId +
                "\nstatus:\t" + status;
    }

    public String isBorrowed(){
        return inStock? "Checked In" : "Checked Out";
    }

    public boolean checkOutBook(String id){
        boolean borrowedSuccessful = false;
        for (Book bookInTheList : books){
            if (bookInTheList.bookId.equals(id) && inStock && !(id.startsWith("9"))){
                inStock = false;
                status = isBorrowed();
                borrowedSuccessful = true;
            }
        }return borrowedSuccessful;
    }

    public void checkInBook(String id){
        for(Book bookInTheList : books){
            if(bookInTheList.bookId.equals(id) && !inStock){
                inStock = true;
                status = isBorrowed();
                System.out.println("Thanks for returning it on time. Have a great day.");
            }else{
                System.out.println("The Book ID is either invalid or belongs to a book which has not checked out.");
            }
        }
    }

    public List<Book> addFictionBook(){
        System.out.print("Input tile:\t");
        title = scanner.nextLine();
        System.out.print("Input author:\t");
        author = scanner.nextLine();
        books.add(new Fiction(title, author));
        return books;
    }

    public List<Book> addNonFictionBook(){
        System.out.print("Input tile:\t");
        title = scanner.nextLine();
        System.out.print("Input author:\t");
        author = scanner.nextLine();
        books.add(new NonFiction(title, author));
        return books;
    }

    public List<Book> addReferenceBook(){
        System.out.print("Input tile:\t");
        title = scanner.nextLine();
        System.out.print("Input author:\t");
        author = scanner.nextLine();
        books.add(new Reference(title, author));
        return books;
    }
}
