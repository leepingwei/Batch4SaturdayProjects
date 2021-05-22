package project4.Batch3Solutions;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class Test1 {

    @Test
    public void TotalLength1() {
        TotalLength tl = new TotalLength();
        HashSet<String> s1 = new HashSet<>();
        s1.add("lab");
        s1.add("17");
        s1.add("Java");
        s1.add("Collections");
        int actual = tl.getTotalLength(s1);
        int expected = 20;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TotalLength2() {
        TotalLength tl = new TotalLength();
        HashSet<String> s1 = new HashSet<>();
        s1.add("");
        int actual = tl.getTotalLength(s1);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void TotalLength3() {
        TotalLength tl = new TotalLength();
        HashSet<String> s1 = new HashSet<>();
        s1.add("Expected");
        s1.add("result");
        s1.add("is");
        s1.add("getTotalLength");
        int actual = tl.getTotalLength(s1);
        int expected = 30;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void sortHashSet1() {
        sortHashSet tl = new sortHashSet();
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(10);
        s1.add(5);
        s1.add(123);
        s1.add(2);
        s1.add(4);
        s1.add(44);
        ArrayList<Integer> actual = tl.sort(s1);
        ArrayList<Integer> expected = new ArrayList<>(s1);
        Collections.sort(expected);

        String actualArrayList = actual.toString();
        String expectedArrayList = expected.toString();
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }

    @Test
    public void sortHashSet2() {
        sortHashSet tl = new sortHashSet();
        HashSet<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(10);
        s1.add(5);
        s1.add(14);
        s1.add(120);
        s1.add(123);
        s1.add(2);
        s1.add(4);
        s1.add(44);

        ArrayList<Integer> actual = tl.sort(s1);
        ArrayList<Integer> expected = new ArrayList<>(s1);
        Collections.sort(expected);

        String actualArrayList = actual.toString();
        String expectedArrayList = expected.toString();
        Assert.assertEquals(expectedArrayList, actualArrayList);
    }


    @Test
    public void DigitPowers1() {
        DigitPowers p1 = new DigitPowers();
        int actual = p1.power4(1234);
        int expected = 354;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DigitPowers2() {
        DigitPowers p1 = new DigitPowers();
        int actual = p1.power4(652);
        int expected = 1937;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DigitPowers3() {
        DigitPowers p1 = new DigitPowers();
        int actual = p1.power4(43563);
        int expected = 2339;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void palindromeNum1() {
        PalindromeNumber p1 = new PalindromeNumber();
        int num = 349;
        int actual = p1.palindromeNum(num);
        int expected = 3;
        Assert.assertEquals("Parameter int = " + num, expected, actual);
    }

    @Test
    public void palindromeNum2() {
        PalindromeNumber p1 = new PalindromeNumber();
        int num = 528;
        int actual = p1.palindromeNum(num);
        int expected = 2;
        Assert.assertEquals("Parameter int = " + num, expected, actual);
    }

    @Test
    public void palindromeNum3() {
        PalindromeNumber p1 = new PalindromeNumber();
        int num = 319;
        int actual = p1.palindromeNum(num);
        int expected = 2;
        Assert.assertEquals("Parameter int = " + num, expected, actual);
    }


    @Test
    public void LetterCount1() {
        LetterCount p1 = new LetterCount();
        String argument =  "aabbccdddeee";
        LinkedHashMap<Character,Integer> actualMap = p1.charCount(argument);
        LinkedHashMap<Character,Integer> expectedMap = new LinkedHashMap<>();
        expectedMap.put('a', 2);
        expectedMap.put('b', 2);
        expectedMap.put('c', 2);
        expectedMap.put('d', 3);
        expectedMap.put('e', 3);

        String actual = new TreeMap(actualMap).toString();
        String expected = new TreeMap(expectedMap).toString();
        Assert.assertEquals("Argument String was \"" + argument + "\"", expected, actual);
    }

    @Test
    public void LetterCount2() {
        LetterCount p1 = new LetterCount();
        String argument =  "k7kk//ee7eey     yyyy777yyyy";
        LinkedHashMap<Character,Integer> actualMap = p1.charCount(argument);
        LinkedHashMap<Character,Integer> expectedMap = new LinkedHashMap<>();
        expectedMap.put('k', 3);
        expectedMap.put('/', 2);
        expectedMap.put('y', 9);
        expectedMap.put('e', 4);
        expectedMap.put('7', 5);
        expectedMap.put(' ', 5);

        String actual = new TreeMap(actualMap).toString();
        String expected = new TreeMap(expectedMap).toString();
        Assert.assertEquals("Argument String was \"" + argument + "\"", expected, actual);
    }
}