package Project1.GroupSolution;

import java.util.Scanner;

public class tellMeYourGrade {


    /*

    Given a String (grade)
    if grade is "A" than ask for the average and
        if the average is greater than 90 print "Congrats"
        else print "Invalid average"
    if grade is "B" print "You're good"
    else (meaning if not "A" or "B") print "You need to work hard"

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine();

        //  code Start here don't change before this line

        if (grade.equals("A")) {
            System.out.print("Enter the average: ");
            int average = scanner.nextInt();
            if (average > 90) {
                System.out.println("Congrats");
            } else {
                System.out.println("Invalid average");
            }
        }else if (grade.equals("B")){
            System.out.println("You're good");
        }
        else {
            System.out.println("You need to work hard");
        }
    }
}
