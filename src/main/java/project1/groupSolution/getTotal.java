package project1.groupSolution;

import java.util.Scanner;

public class getTotal {

      /*

        Given three positive numbers as a String with a space between numbers beginning with a symbol
        i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
        remove all the non numeric characters.
        parse the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be ==> 65;

        NOTE : if the output less then 0 change output to -1

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String allElements = scanner.nextLine();
        String[] elements = allElements.split(" ");

        String num1 = elements[0]; // "$15"
        String num2 = elements[1]; // "$20"
        String num3 = elements[2]; // "$30"

        //  code Start here don't change before this line
        //   use Strings num1 , num2 , num3

        num1 = num1.replaceAll("[^a-zA-Z0-9]", "");
        num2 = num2.replaceAll("[^a-zA-Z0-9]", "");
        num3 = num3.replaceAll("[^a-zA-Z0-9]", "");

        int parse1 = Integer.parseInt(num1);
        int parse2 = Integer.parseInt(num2);
        int parse3 = Integer.parseInt(num3);

        int total = parse1 + parse2 + parse3;
        System.out.println("The total is: " + total);
    }
}
