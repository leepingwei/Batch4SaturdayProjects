package project4.batch4Solutions;

    /*
    Create a method whose name is power4
    It takes an int parameter
    It returns an int

    The method gets each "digit" of the parameter int number
    It calculates(returns) the sum of the 4th powers of each digit.

    Example: parameter int is 15302
    1⁴ + 5⁴ + 3⁴ + 0⁴ + 2⁴ = 1 + 625 + 81 + 0 + 16 = 723
    The method returns the result: 723
    */

public class DigitPowers {

    public static int power4(int number){
        String parameter = Integer.toString(number);
        char[] numbers = parameter.toCharArray();

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            int digit = Integer.parseInt(String.valueOf(numbers[i]));
            sum += (int)Math.pow(digit,4);
        }
        return sum;
    }
}
