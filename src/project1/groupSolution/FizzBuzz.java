package project1.groupSolution;

import java.util.Scanner;

public class FizzBuzz {

    /*
        Write a program
            -that returns "fizz" when given number is divisible by 5
            -that returns "buzz" when given number is divisible by 3
            -that returns "fizzbuzz" when given number is divisible by both 3 and 5
            -that returns same number when it is not divisible by both 3 and 5

        Examples:
            input1 -> 10 | output1 -> fizz
            input2 -> 9  | output2 -> buzz
            input3 -> 30 | output3 -> fizzbuzz
            input4 -> 7  | output4 -> 7
     */



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        //  code Start here don't change before this line

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("fizzbuzz");
        }
         else if (number % 5 == 0) {
            System.out.println("Fizz");
            }
         else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

        if (number % 5 == 0) {
            System.out.print("fizz");
        }
        if (number % 3 == 0) {
            System.out.println("buzz");
        }
        if (!(number % 5 == 0) && !(number % 3 == 0)) {
            System.out.println(number);
        }

    }

}
