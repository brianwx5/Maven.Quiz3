package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] waveArray = new String[str.length()];
        for (int i = 0; i < str.length() -1 ; i++) {
            waveArray[i] = str;
        }
        for (int i = 0; i < waveArray.length ; i++) {
            for (String word: waveArray) {
                Character.toUpperCase(word.charAt(i));
            }
        }
        return waveArray;
    }
}
