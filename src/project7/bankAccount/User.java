package project7.bankAccount;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class User {

    /*
        Create public instance variables of String (name, password ,dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully)
        Create public instance variables of int (accountNumber ,amountAccount1, accountNumber2, amountAccount2)
     */


    /*
    NOTE:
    Before the constructor create the methods which given under the constructor and than come back to create the constructor
     */
    /*
    Create a constructor
    Parameters are String name , password , dateOfBirth , marriageStatus
    int amountAccount1 , amountAccount2
    instance variable name equals to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    variable accountNumber1 gets the the number from the  randomNumberCreator method
    variable accountNumber2 gets the the number from the  randomNumberCreator method
    variable marriageStatus gets the value from the checkMarriageStatus method
    variable dateOfBirth gets the value from the checkAge method
     */



    /*
        Create method whose name is checkMarriageStatus
        parameter is String(marriageStatus)
        return type is String
        if String marriageStatus equals "married"
        Ask to user (use scanner class)
        Do you want to add add your relative?
        if the user says "Yes"
        Ask to user
        What is your relative's name?
        Ask to user
        Date of birth of your relative?
        Then Add the relative (use AddRelative class) (Hint create an object of AddRelative class)
        relativeName variable equals to AddRelative class fullName
        relativeDoB variable equals to AddRelative class relativeDoB
            if relativeDoB equals to "0"
                then change the relativeName to "Relative should be more then 18 years old"
                then change the relativeDoB to "Relative should be more then 18 years old"
                return the "Relative should be more then 18 years old"
            if the relativeDoB is not equal to "0"
               return "Transaction done successfully"
        If the user say No
        then return "no need to add relative".
     */


    /*
        Create a static method whose name is checkAge
        parameter is one String (myDOB)
        return type is a String
        Compare today's date to myDOB
        if myDOB compare to present date is greater than 18 then return "You can get a credit card"
        if myDOB compare to present date is less then 18 "You should be at least 18 years old to get a credit card."
        if myDOB compare to present date equals 18 then you need to compare the months.(use nested if)
        if today's monthvalue is greater than myDOB's monthvalue return "You can get a credit card"
        if today's monthvalue is less than myDOB's monthvalue return "You should be at least 18 years old to get a credit card."
        if today's monthvalue is equal to myDOB's monthvalue , you need to compare day of the months.
        If today's amount of day is greater than myDOB's amount of days return "You can get a credit card"
        else return "You should be at least 18 years old to get a credit card."
        For example if today's date is 06/12/2021
        if myDOB is 06/05/2003
        return should be  "You can get a credit card"
        if myDOB is 06/15/2003
        return should be  "You should be at least 18 years old to get a credit card."
        (Optional: You may use LocalDate and/or other related classes. It will be much simpler.)
     */


    /*
        Create randomNumberCreator method which returns 8-digit int number between 10_000_000 and 99_999_999
     */


    /*
        Create a method whose name is transfer
        Parameters are two User objects (own, other)
        Return type is void
        In this method
            First ask to user "Do you want to transfer between your accounts or different user" (use scanner class)

        if the answer is "own"
        Ask to user "Enter amount of money you want to transfer"
       this amount will be your transferAmount to use for the transferToOwnAccount method that below
           instance variable isTransferedSuceesfully equals to the the method transferToOwnAccount in the Account class

        if the answer "different"
        Ask to user "Enter amount of money you want to transfer"
        this amount will be your transferAmount to use for the transferOtherUser method that below
         instance variable isTransferedSuceesfully equals to the the method transferOtherUser in the Account class
     */


    /*
        Print the objects using toString method
        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......
     */


}