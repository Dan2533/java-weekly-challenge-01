package com.codedifferently.day04Friday;

import org.junit.Assert;
import org.junit.Test;

public class IntegerUtilsTest {
    @Test
    public void getSumTest() {
        // : Given
        Integer input = 5;
        Integer expected = 10;

        // : When
        Integer actual = IntegerUtils.getSumOfN(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testIsEven() {
        // : Given
        Integer input = 6;

        // : When
        Boolean actual = IntegerUtils.isEven(input);

        // : Then
        Assert.assertTrue(actual);
    }

    @Test
    public void testIsEven2() {
        // : Given
        Integer input = 7;

        // : When
        Boolean actual = IntegerUtils.isEven(input);

        // : Then
        Assert.assertFalse(actual);
    }

    @Test
    public void reverseDigitsTest() {
        // : Given
        Integer input = 12345;
        Integer expected = 54321;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void reverseDigitsTest2() {
        // : Given
        Integer input = 876945;
        Integer expected = 549678;

        // : When
        Integer actual = IntegerUtils.reverseDigits(input);

        // : Then
        Assert.assertEquals(expected, actual);
    }

}
