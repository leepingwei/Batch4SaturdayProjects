package project6.Settings;

import java.util.ArrayList;

public class Address {

   /*
        Create three private instance variables of String
        address1
        city
        zipCode
     */

    // Given the following ArrayList (Do not change it!)
    private static ArrayList<String> cityList = new ArrayList<>();
    public void SetCity() {
        cityList.add("New York");
        cityList.add("New Jersey");
        cityList.add("Ohio");
        cityList.add("Pennsylvania");
        cityList.add("Washington");
        cityList.add("Atlanta");
    }

    /*
    Create a method name is Address1
    Return type is String
    Parameter is String(myAddress)

   It assigns the parameter to the instance variable 'address1'
     */



    /*
        Create a method name is City
        return type is String
        parameter is String(myCity)

        if cityList does NOT contains myCity
        return "We are not able to ship to your location"

        if the above condition is false
        private City (which comes from class variable) equal to myCity

     */


    /*
        Create a method name is ZipCode
        Return type is String
        Parameter is String(myZipcode)

        if myZipcode length is NOT 5
        return Zip code length should be 5

        If the above condition is false
        private ZipCode (which comes from class variable) equal to myZipcode

     */



}
