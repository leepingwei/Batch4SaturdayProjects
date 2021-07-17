package project10.groupSolution;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        User user;

        System.out.println("Welcome to our library!");
        System.out.print("Input a 4-digit User ID:\t");
        String inputId = scanner.nextLine();
        if(inputId.startsWith("1")){
            user = new Librarian();
        }else if(inputId.startsWith("2")){
            user = new Teacher();
        }else if(inputId.startsWith("3")){
            user = new Student();
        }else{
            System.out.println("Please input a valid ID!");
        }
    }
}

