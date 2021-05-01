package Project1.GroupSolution;

import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
            Given two string by using scanner class and add each other
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

        if (s1.charAt(s1.length()-1) == s2.charAt(0)){
            System.out.println(s1.concat(s2.substring(1)));

        }else {
            System.out.println(s1.concat(s2));
        }
    }
}
