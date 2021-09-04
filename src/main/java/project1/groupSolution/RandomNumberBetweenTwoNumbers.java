package project1.groupSolution;

import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers
    i.e. "15 20" or "7 235"

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

    Challenge: what if we do not know if the first number is smaller than the second.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] elements = s1.split(" ");
        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        //  code Start here don't change before this line

        int randomNum = (int) (Math.random() * max)-min;
        // int result = (int) (Math.random() * (max-min) +min ); // another way
        System.out.println(randomNum);


    }
}
