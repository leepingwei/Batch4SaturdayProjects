package project11;

/**
 * Use project10 solution library app and write automation test cases of the tests on Project 11 Test Cases excel file.
 */

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import project10.solution.Users.User;
import project10.solution.Data;
import project10.solution.LibraryApp;

public class Tests {

    @Rule
    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

//////////////////////// Write your test scripts below this line ///////////////////////////////////////////////////////

    @Test
    public void test1() {
        systemInMock.provideLines("abcd", "C");
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
}
