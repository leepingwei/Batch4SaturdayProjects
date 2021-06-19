package project7.groupSolution.bankAccount;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AddRelative {


    /*
    Create an instance variable
        String fullName , String relativeDoB
     */
    String fullName, relativeDoB;

    /*
        Create a constructor with the parameters String fullName and  String relativeDoB
        instance variable fullName equals to parameter fullName
        If the age is greater than or equal to 18, set the instance variable relativeDoB to parameter relativeDoB (use relativeAgeChecker method)
        If the age is less than 18, set the instance variable relativeDoB to "0"
     */
    public AddRelative(String fullName, String relativeDoB){
        this.fullName = fullName;
        this.relativeDoB = relativeAgeChecker(relativeDoB)? relativeDoB : "0";
    }

    /*
        Create a method name is relativeAgeChecker
        parameter String relativeDoB
        return type is boolean
        if the relativeDoB is more than or equal to 18, return true
        else return false
        Note: use the User class's checkAge method (check which statement gives you the age greater than or equal to 18)
     */
    public boolean relativeAgeChecker(String relativeDoB){
        return User.checkAge(relativeDoB).equals("You can get a credit card.");
//
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
//        LocalDate convertDoB = LocalDate.parse(relativeDoB, formatter);
//        int year = convertDoB.getYear();
//        int month = convertDoB.getMonthValue();
//        int day = convertDoB.getDayOfMonth();
//
//        LocalDate dob = LocalDate.of(year,month,day);
//
//        LocalDate now = LocalDate.now();
//        Period age = Period.between(dob, now);
//        int ageResult =age.getYears();
//
//        return (ageResult >= 18);
    }
}


