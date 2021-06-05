package project4.batch4Solutions;

import java.util.Set;

    /*

    Create a method whose name is getTotalLength
    It takes a Set of Strings as parameter
    It returns an int

    The method returns the total length of each String in the Set.
    If the total is 0, then the method returns -1.

    Example:
       Set String is {"repl", "is", "homework"}
       The method returns 14
     */

public class TotalLength {

    public static int getTotalLength(Set<String> set){

        int sum = 0;
        for(String element : set){
            sum += element.length();
        }
        return (sum == 0)? -1 : sum;
    }




}
