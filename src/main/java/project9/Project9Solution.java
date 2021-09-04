package project9;

import org.junit.Assert;
import org.junit.Test;
import project8.groupsolution.Mortgage.HousePrices;
import project8.groupsolution.Mortgage.StatesTax;

public class Project9Solution {

    /*
In this project, you will write tests for Project 8.
Write test scripts for the following tests. (Use project 8 solution and all of your tests can be under Project9 class.)

Use the following given test data for your tests:
    Owner Name: Sarah
    Condition: New
    House Type: Condo
    Number of rooms: 5
    Down payment: $0
    Number of months: 60
    Location of house: Ohio
     */

    HousePrices houseOfSarah = new HousePrices(
            "Sarah",
            "New",
            "Condo",
            5,
            0,
            60,
            StatesTax.OHIO
    );

//      Test 1: Verify the state tax rate of Ohio is 12
    @Test
    public void Test1(){
        int expected = 12;
        int actual = StatesTax.OHIO.getRate();
        Assert.assertEquals("Testing the state tax rate of Ohio: ", expected, actual);
    }

//      Test 2: Verify the name of the owner is Sarah
    @Test
    public void Test2() {
        String expected = "Sarah";
        String actual = houseOfSarah.getOwnerName();
        Assert.assertEquals("Testing the name of the owner: ", expected, actual);
    }

//  Test 3: Verify the condition of Sarah's house is new
        @Test
        public void Test3(){
            String expected = "New";
            String actual = houseOfSarah.getCondition();
            Assert.assertEquals("Testing the condition of Sarah's house: ", expected, actual);
    }

//  Test 4: Verify the type of Sarah's house is Condo
    @Test
    public void Test4(){
        String expected = "Condo";
        String actual = houseOfSarah.getHouseType();
        Assert.assertEquals("Testing the type of Sarah's house: ", expected, actual);
    }

//  Test 5: Verify the number of rooms in Sarah's house is 5
    @Test
    public void Test5(){
        int expected = 5;
        int actual = houseOfSarah.getRoomCount();
        Assert.assertEquals("Testing the number of rooms in Sarah's house: ", expected, actual);
    }

//  Test 6: Verify the price of Sarah's house
    @Test
    public void Test6(){
        int expected = 156800;
        int actual = houseOfSarah.getPrice();
        Assert.assertEquals("Testing the price of Sarah's house: ", expected, actual);
    }

//  Test 7: Verify the monthly payment of Sarah's house
    @Test
    public void Test7(){
        int expected = 2613;
        int actual = houseOfSarah.getMonthlyPayment();
//        int actual = houseOfSarah.getPrice() / houseOfSarah.getNumberOfMonths();
        Assert.assertEquals("Testing the monthly payment of Sarah's house: ", expected, actual);
    }

//  Test 8: Verify the new monthly payment of her house after Sarah decides to put a down payment of $20,000
    @Test
    public void Test8() {
        HousePrices housePrices = new HousePrices(
                "Sarah",
                "New",
                "Condo",
                5,
                20000,
                60,
                StatesTax.OHIO
        );
        int expected = 2280;
        int actual = housePrices.getMonthlyPayment();
//        int actual = (houseOfSarah.getPrice() - 20_000) / houseOfSarah.getNumberOfMonths();
        Assert.assertEquals("Testing the new monthly payment if put a down payment of $20,000: ", expected, actual);
    }

//  Test 9: After the evaluation, the condition of the house turned to be "like new" instead of "new". Verify the new price of Sarah's house (with 0 down payment)
    @Test
    public void Test9(){
        HousePrices housePrices = new HousePrices(
                "Sarah",
                "LikeNew",
                "Condo",
                5,
                0,
                60,
                StatesTax.OHIO
        );
        int expected = 145600;
        int actual = housePrices.getPrice();
        Assert.assertEquals("Testing the new price of Sarah's house if the condition of the house turned to be \"like new\": ",
                expected, actual);
    }

//  Test 10: Ohio increased the state tax rate to %15 before the closing date. Verify the new monthly payment of Sarah
//           (consider the condition of the house is still new and no down payment)
    @Test
    public void Test10(){
        int expected = 161000;
//        int actual = houseOfSarah.getPrice() * (100 + StatesTax.OHIO.getRate() + 3) / (100 + StatesTax.OHIO.getRate());
        int actual = houseOfSarah.getPrice() * 115 / 112;
        Assert.assertEquals("Testing the new monthly payment of Sarah if State tax rate increase to 15%: ",
                expected, actual);
    }

//  Test 11: Verify that the monthly payment for 60 months with zero down payment is more than the monthly payment for 50 months with a down payment of $25,000
    @Test
    public void Test11(){
        HousePrices housePrices2 = new HousePrices(
                "Sarah",
                "LikeNew",
                "Condo",
                5,
                25000,
                50,
                StatesTax.OHIO
        );
        Assert.assertTrue("Testing if monthly payment plan be changed: ",
                houseOfSarah.getMonthlyPayment() > housePrices2.getMonthlyPayment());
    }

//  Test 12: Verify that Sarah's house is not in New York.
    @Test
    public void Test12(){
        Assert.assertNotEquals("Testing if Sarah's house is not in New York: ",
                houseOfSarah.getStatesTax(), StatesTax.NEWYORK);
    }

//  Test 13: Verify that Sarah's monthly payments would be less if she got the same house in Florida (under the same conditions)
    @Test
    public void Test13(){
        HousePrices housePricesFlorida = new HousePrices(
                "Sarah",
                "New",
                "Condo",
                5,
                0,
                60,
                StatesTax.FLORIDA
        );
        Assert.assertTrue("Testing Sarah's monthly payments would be less if she got the same house in Florida: ",
                housePricesFlorida.getMonthlyPayment() < houseOfSarah.getMonthlyPayment());
    }

//  Test 14: Write your own test. (Feel free to use some other test data than Sarah's house. Not ideal, but you may repeat one of the above test scenario with your new data.)
//  Check if these two house got same owner
    @Test
    public void Test14(){
        HousePrices housePrices1 = new HousePrices(
                "Sarah",
                "Renovation Required",
                "House",
                5,
                0,
                60,
                StatesTax.NEWJERSEY
        );
        HousePrices housePrices2 = new HousePrices(
                "James",
                "Renovation Required",
                "House",
                5,
                0,
                50,
                StatesTax.NEWJERSEY
        );
        Assert.assertNotEquals("Testing if these two house got same owner: ",
                housePrices1.getOwnerName(), housePrices2.getOwnerName());
    }

//  Test 14: Write another test of yours. (Feel free to use some other test data than Sarah's house. Not ideal, but you may repeat one of the above test scenario with your new data.)
//  Would an Old house more expensive than a house need Renovation in Florida?
    @Test
    public void Test15(){
        HousePrices housePricesOld = new HousePrices(
                "Sarah",
                "Old",
                "House",
                5,
                0,
                60,
                StatesTax.FLORIDA
        );
        HousePrices housePricesRenovation = new HousePrices(
                "Sarah",
                "Renovation Required",
                "House",
                5,
                0,
                60,
                StatesTax.FLORIDA
        );
        Assert.assertTrue("Testing if an Old house more expensive than a house need Renovation in Florida: ",
                housePricesOld.getPrice() > housePricesRenovation.getPrice());
    }
/*
Good Luck!!!
 */
}
