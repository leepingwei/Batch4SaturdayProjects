package project4.batch4Solutions;

    /*
            Create a method whose name is charCount
            It takes a String parameter
            It returns a LinkedHashMap<Character, Integer>

            The method maps each distinct char from the given String with the number of occurrence of the char in the String
            It returns the mapping as LinkedHashMap<Character, Integer>

            Example:
            String = "a5ab555bb.. cc  5cc55"

            The method returns the mapping of {'a'=2, 'b'=3, '5'=7, 'c'=4, '.'=2, ' '=3}
            Note: The returned map is just for demonstration purpose, do not print the map.
     */

import java.util.LinkedHashMap;

public class LetterCount {
    public static LinkedHashMap<Character,Integer> charCount(String str){

        char[] ch = str.toCharArray();

        LinkedHashMap<Character, Integer> myLinkedMap = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (myLinkedMap.containsKey(ch[i])){
                myLinkedMap.put(ch[i], myLinkedMap.get(ch[i]) + 1);
            } else {
                myLinkedMap.put(ch[i], 1);
            }
        }
        return myLinkedMap;
    }
}
