package com.codedifferently.basic_drills;


public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String[] split = input.split("");
        return (split[0] + split[1] + split[2]);
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        String[] split = input.split("");
        return (split[split.length - 3] + split[split.length - 2] + split[split.length - 1]);
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        if (inputValue == comparableValue) {
        return true;
        }
        else {
        return false;
        }
    }
    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue) {

       int middle = 0;
       if((inputValue.length() % 2 == 1)) {
            middle = (inputValue.length() / 2);
       }else {
            middle = (inputValue.length() /2 -1);
        }

      return inputValue.charAt(middle);
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        String firstWord = spaceDelimitedString;
        if(spaceDelimitedString.contains(" ")) {
             firstWord = spaceDelimitedString.substring(0, spaceDelimitedString.indexOf(" "));

        }
        return firstWord;
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String[] words = spaceDelimitedString.split(" ");
        return words[1];
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        char[] chars = stringToReverse.toCharArray();
        String ans = "";
        //apple
        for(int i = chars.length-1; i >= 0; i-- ){
            ans += chars[i] + "";
        }
        return ans;
    }
}
