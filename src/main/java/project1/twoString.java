package project1;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class
            add the second string after the first one
            If the first word ends with the same letter as the second word starts with, then remove it.

            Example: "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
        */

        Scanner dp = new Scanner(System.in);
        String  allElements = dp.nextLine();
        String[] elements = allElements.split(" ");
        String s1 = elements[0];
        String s2 = elements[1];

        // code start here use s1 and s2 as words

        System.out.println("printing");
    }
}
