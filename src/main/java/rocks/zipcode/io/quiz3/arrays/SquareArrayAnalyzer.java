package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        Integer[] newSquaredArray = new Integer[input.length];
        for (int i = 0; i < newSquaredArray.length; i++) {
            newSquaredArray[i] = input[i] * input[i];
        }
        Arrays.sort(newSquaredArray);
        Arrays.sort(squaredValues);

        if (newSquaredArray.length == squaredValues.length) {
            return true;
        } else {
            return false;
        }

    }
}
