package com.codedifferently.day04Friday;

public class IntegerUtils {
    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int sum = 0;
        for (int value = 0; value < n; value++) {
            sum += value;
        }

        return sum;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        // while loop
        int num = val;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        } return reversed ;
    }

// reverse string set = to result integer
        //look up a method to turn a string into an integer



        /**
         * @param val integer value input by client
         * @return true if the integer is even and false if it is not even.
         */
        public static Boolean isEven (Integer val) {
           //% modulous
            Boolean result = val % 2 == 0;

            return result;
        }


}