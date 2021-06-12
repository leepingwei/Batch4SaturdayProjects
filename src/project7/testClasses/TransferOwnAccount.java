package project7.testClasses;

import project7.bankAccount.User;
import org.junit.Assert;


public class TransferOwnAccount {


    public static void main(String[] args) {

        User u1 = new User("Steven" , "Gerard", "10/02/2000", "married" ,1000 , 2000);
        u1.transfer(u1,u1);
        System.out.println(u1);
        Assert.assertTrue("result should be 900 but your result is " +u1.amountAccount1 ,u1.amountAccount1==900);
        Assert.assertTrue("result should be 2099 but your result is " +u1.amountAccount2 , u1.amountAccount2==2099 );


            /*
            Run this class and enter the below information on the console.
             */

    /*
      Do you want to add add your relative?
        Yes
        What is your relative's name?
        gerry
        Date of birth of your relative?
        11/11/2002
        Do you want to transfer between your accounts or different user
        own
        Enter amount of money you want to transfer
        100
    */


        /*
        Output should be:
        name: Steven
        password: Gerard
        dateOfBirth: You can get a credit card
        marriageStatus: Relative should be more then 18 years old
        accountNumber: 77650360
        amount in account 1 : 900
        accountNumber2: 95990730
        amount in account 2 : 2099
        relativeName: Relative should be more then 18 years old
        relativeAge: Relative should be more then 18 years old
         */
    }

}
