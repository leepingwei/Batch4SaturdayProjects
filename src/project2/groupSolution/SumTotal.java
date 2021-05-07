package project2.groupSolution;

public class SumTotal {

    /*
        Create the following 2D String array (you may hardcode for creating it)
        {{"$12", "$22", "5"},{"€9", "€10", "€40", "$1" , "$2"}, {"€12", 6, $4, 1}}

        if the String has $ multiply the value by 3.2
        if the String has € multiply the value by 4.2
        if the element has no $ or € use its own number value
        Print the sum of all values  // (output is to be 441.4)
     */

    public static void main(String[] args) {

        String[][] values = {{"$12", "$22", "5"}, {"€9", "€10", "€40", "$1", "$2"}, {"€12", "6", "$4", "1"}};
        double sum;
        double dollar = 0;
        double euro = 0;
        double numbers = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                if (values[i][j].contains("$")) {
                    values[i][j] = values[i][j].replaceAll("[^\\d.]", "");
                    dollar += Double.parseDouble(values[i][j]) * (3.2);

                } else if (values[i][j].startsWith("€")) {
                    values[i][j] = values[i][j].replaceAll("[^\\d.]", "");  // illegal escape character in string literal !!!
                    euro += Double.parseDouble(values[i][j]) * (4.2);

                } else {
                    numbers += Double.parseDouble(values[i][j]);
                }
            }
        }
        sum = dollar + euro + numbers;
        System.out.println(sum);
//         System.out.println((int) sum + 0.4); // This code gives the correct result.
    }
}



