package com.codedifferently.day02Wednesday;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       //adding each word to a string array
        String[]individualWord = str.split(" ");
        String result = "";
        //looping through each word
        for(String element:individualWord) {
            //making the first letter in a word uppercase and the other letters lower case
            result += element.substring(0,1).toUpperCase()+element.substring(1).toLowerCase()+" ";
        }
        // removes extra white space
        return result.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String words = "";
        //for loop, loops through indexes
        for(int i =str.length()-1;i >= 0; i--) {
            words+=str.charAt(i);
        }
        return words;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        String[] before = str.split(" ");
        String result = "";
        //for each loop through the data type
        for (String element: before) {
            for (int i=element.length()-1;i>=0; i--){
                result+=element.charAt(i);
            }
            result+=" ";
        }
        return result.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
       String words = "";
       for(int i =str.length()-1;i >= 0; i --) {
           words+=str.charAt(i);
       }
       String result ="";
      String[]old= words.split(" ");
       for(String element:old){
           result+=element.substring(0,1).toUpperCase()+element.substring(1).toLowerCase()+" ";
       }
        return result.trim();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1,str.length()-1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        StringBuilder result = new StringBuilder();
        // i is equal to the length of the string
        for (int i =0;i <str.length();i++) {
            if(Character.isUpperCase(str.charAt(i))){
                result.append(Character.toLowerCase(str.charAt(i)));
            } else if (Character.isLowerCase(str.charAt(i))){
                result.append(Character.toUpperCase(str.charAt(i)));
            } else{
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
