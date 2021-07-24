package project11;

/**
 * Use project10 solution library app and write automation test cases of the tests on Project 11 Test Cases excel file.
 */

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import project10.solution.Books.Book;
import project10.solution.Users.Student;
import project10.solution.Users.Teacher;
import project10.solution.Users.User;
import project10.solution.Data;
import project10.solution.LibraryApp;

import java.time.LocalDate;

public class TestsSolution {

    @Rule
    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

//////////////////////// Write your test scripts below this line ///////////////////////////////////////////////////////

    @Test
    public void test1() {
        systemInMock.provideLines("abcd", "C");
        LibraryApp.main(null);
    }

    @Test
    public void test2(){
        systemInMock.provideLines("\n", "C");
        LibraryApp.main(null);
    }

    @Test
    public void test3() {
        systemInMock.provideLines("1000", "0");
        LibraryApp.main(null);
        User expected = Data.getUserMap().get(1000);
        User actual = LibraryApp.getActiveUser();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test4() {
        systemInMock.provideLines("2001", "0");
        LibraryApp.main(null);
        User expected = Data.getUserMap().get(2001);
        User actual = LibraryApp.getActiveUser();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test5() {
        systemInMock.provideLines("3002", "0");
        LibraryApp.main(null);
        User expected = Data.getUserMap().get(3002);
        User actual = LibraryApp.getActiveUser();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test6() {
        systemInMock.provideLines("2002", "1", "10002", "0");
        LibraryApp.main(null);
        Book expected = Data.getUserMap().get(2002).getBookList().get(10002);
        Book actual = LibraryApp.getActiveUser().getBookList().get(10002);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test7(){
        systemInMock.provideLines("3000", "1", "20000", "0");
        LibraryApp.main(null);
        LocalDate expected = Data.getUserMap().get(3000).getBookList().get(20000).getDueDate();
        LocalDate actual = LibraryApp.getActiveUser().getBookList().get(20000).getDueDate();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test8(){
        systemInMock.provideLines("2001", "1", "10000", "0");
        LibraryApp.main(null);
        LocalDate expected = Data.getUserMap().get(2001).getBookList().get(10000).getDueDate();
        LocalDate actual = LibraryApp.getActiveUser().getBookList().get(10000).getDueDate();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test9(){
        systemInMock.provideLines("1001", "1", "10002", "0");
        LibraryApp.main(null);
        LocalDate expected = Data.getUserMap().get(1001).getBookList().get(10002).getDueDate();
        LocalDate actual = LibraryApp.getActiveUser().getBookList().get(10002).getDueDate();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test10() {
        systemInMock.provideLines("1001", "1", "90001", "0");
        LibraryApp.main(null);
        Book expected = null;
        Book actual = LibraryApp.getActiveUser().getBookList().get(90001);
        Assert.assertSame(expected, actual);
    }

    @Test
    // Suppose to be fail
    public void test11() {
        systemInMock.provideLines("2000", "1", "abcde", "0");
        LibraryApp.main(null);
        Book expected = Data.getUserMap().get(2000).getBookList().get("abcde");
        Book actual = LibraryApp.getActiveUser().getBookList().get("abcde");
        Assert.assertSame(expected, actual);
    }

    @Test
    // Code not working, need instruction
    public void test12(){
        systemInMock.provideLines("2000", "1", "10000", "2", "10000", "0");
        LibraryApp.main(null);
        boolean expected = false;
        boolean actual = LibraryApp.getActiveUser().getBookList().get(10000).isCheckedOut();
        Assert.assertSame(expected, actual);
    }

    @Test
    // Code not working, need instruction
    public void test13(){
        systemInMock.provideLines("1001", "5", "10000", "2002", "2", "10000", "0");
        LibraryApp.main(null);
        boolean expected = false;
        boolean actual = LibraryApp.getActiveUser().getBookList().get(10000).isCheckedOut();
        Assert.assertSame(expected, actual);
    }

    @Test
    // Code not working, need instruction
    public void test14(){
        systemInMock.provideLines("1000", "5", "20000", "2001", "0");
        LibraryApp.main(null);
        User expected = Data.getUserMap().get(2001).getBookList().get(20000).getBorrower();
        User actual = LibraryApp.getActiveUser().getBookList().get(20000).getBorrower();
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test15(){
        systemInMock.provideLines("1000", "5", "90000", "3002", "0");
        LibraryApp.main(null);
        Book expected = null;
        Book actual = LibraryApp.getActiveUser().getBookList().get(90000);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test16(){
        systemInMock.provideLines("1000", "3", "2", "John", "Smith", "2065", "0");
        LibraryApp.main(null);
        boolean expected = true;
        boolean actual = Data.getUserMap().containsKey(2065);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test17(){
        systemInMock.provideLines("1000", "3", "3", "John", "Smith", "3065", "0");
        LibraryApp.main(null);
        boolean expected = true;
        boolean actual = Data.getUserMap().containsKey(3065);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test18(){
        systemInMock.provideLines("1000", "3", "1", "John", "Smith", "1066", "0");
        LibraryApp.main(null);
        boolean expected = true;
        boolean actual = Data.getUserMap().containsKey(1066);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test19(){
        systemInMock.provideLines("1000", "3", "3", "John", "Smith", "5065", "3165", "0");
        LibraryApp.main(null);
        boolean expected = true;
        boolean actual = Data.getUserMap().containsKey(3165);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test20(){
        systemInMock.provideLines("1000", "3", "2", "John", "Smith", "2165", "0");
        LibraryApp.main(null);
        int expected = 21;
//        int actual = Don't know how to get the value of MAX_DAYS of the user;
//        Assert.assertSame(expected, actual);
    }

    @Test
    public void test21(){
        systemInMock.provideLines("1000", "4", "1", "11002", "Hello World", "Lee", "0");
        LibraryApp.main(null);
        boolean expected = true;
        boolean actual = Data.getBookMap().containsKey(11002);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test22(){
        systemInMock.provideLines("1000", "4", "9", "11109", "99001", "TestNG", "Lee", "0");
        LibraryApp.main(null);
        boolean expected = true;
        boolean actual = Data.getBookMap().containsKey(99001);
        Assert.assertSame(expected, actual);
    }

    @Test
    public void test23(){
        // Infinity loop, book creation cannot be false
        // Or I didn't understand the requirement
    }
}
