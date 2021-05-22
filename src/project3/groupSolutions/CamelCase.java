package  project3.groupSolutions;

    /*

   Create a method whose name is camelCase
   It takes a String parameter
   It returns a String

   The String argument is a sentence with some words delimited by a space. The argument might be a single word too.
   The method capitalizes all the first letters of the word(s) in the argument

   Sample-1:
   my family live in united states -> My Family Live In United States

   Sample-2:
   sleeplessness -> Sleeplessness

     */

public class CamelCase {

    public String camelCase(String str){

        String words[]=str.split("\\s");   // better to use " " instead of regex for readability
        String capitalizeWord="";
        for(String w:words){
            String first = w.substring(0,1);
            String afterFirst = w.substring(1);
            capitalizeWord += first.toUpperCase()+afterFirst+" ";   // better to use concat() instead of +
        }
        return capitalizeWord.trim();


    }


}
