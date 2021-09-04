package project4.batch4Solutions;

    /*
       Create a method whose name is sort
       It takes a HashSet of Integers as parameter
       It returns an ArrayList of Integers

        The method sorts the given HashSet (in ascending order)
        It changes the sorted HashSet to an ArrayList
        It returns the ArrayList

        NOTE : DO NOT USE COLLECTIONS CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES
     */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SortHashSet {

    public static ArrayList<Integer> sort(HashSet<Integer> set){

        //       By using different set type
        //        TreeSet<Integer> convert = new TreeSet<>(set);
        //        ArrayList<Integer> result = new ArrayList<>(convert);
        //        return result;

        // By using for loop
        ArrayList<Integer> sortList = new ArrayList<>(set);
        for (int i = 0; i < sortList.size(); i++) {
            for (int j = i+1; j < sortList.size(); j++) {
                if (sortList.get(i) > sortList.get(j)){
                    Integer temp = sortList.get(i);
                    sortList.set(i, sortList.get(j));
                    sortList.set(j, temp);
                }
            }
        }
        return sortList;
    }
}
