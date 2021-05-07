package project1.groupSolution;

import java.util.Scanner;

public class age {

     /*
        Given an int ,
            if the Project1.age less then and equal to 10
                print  "too young to create a Facebook account"

             if the Project1.age less then and equal to 16
                print  "too young to get a driver's license"

             if the Project1.age less then and equal to 18
                print  "too young to get a tattoo"

            if the Project1.age less then and equal to 21
                print  "too young to drink alcohol"

            if the Project1.age bigger or equal to 21
                print  "do what ever you want to do"

        Note: use if else statement.
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int myAge = scanner.nextInt();

        //  code Start here don't change before this line

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age: ");
//        int myAge = scanner.nextInt();

        if (myAge <= 10 ){
            System.out.println("too young to create a Facebook account");
        } else if (myAge <= 16) {
            System.out.println("too young to get a driver's license");
        } else if (myAge <= 18) {
            System.out.println("too young to get a tattoo");
        } else if (myAge <= 21) {
            System.out.println("too young to drink alcohol");
        } else {
            System.out.println("do what ever you want to do");
        }




    }
}
