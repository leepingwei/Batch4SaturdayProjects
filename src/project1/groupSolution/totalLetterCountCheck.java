package project1.groupSolution;

import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the characters in the given String is odd print true else print false

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //  code Start here don't change before this line

        int strLength = word.length();
        if (strLength % 2 == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
