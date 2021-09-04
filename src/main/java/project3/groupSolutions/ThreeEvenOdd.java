package  project3.groupSolutions;

/*

   Create a method whose name is threeEvenOrOdd
   It takes an int array as parameter
   It returns a boolean

   It returns true if the argument array contains EITHER three even OR three odd values.
   It returns false otherwise.

   Sample:
   [2, 3, 10, 8] -> true
   [5, 11, 27] -> true
   [1, 2, 3, 4] -> false
   [5, 10] -> false
   [1, 2, 3, 4, 5, 6] -> true

 */

public class ThreeEvenOdd {

    public boolean threeEvenOrOdd(int[] arr){

        int counter1 = 0;    // better variable naming suggested
        int counter2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                counter1++;
            else
                counter2++;
        }return (counter1 >= 3 || counter2 >= 3);
    }

}
