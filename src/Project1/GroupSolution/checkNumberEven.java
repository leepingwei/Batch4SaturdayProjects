package Project1.GroupSolution;

import java.util.Scanner;

public class checkNumberEven {

    /*
        Given an int check the number is even or not

        if the number is even print true

        if the number is odd print false

        result should be true or false.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        //  code Start here don't change before this line

        if (number % 2 == 0) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        System.out.println(number % 2 == 0);
    }

}
