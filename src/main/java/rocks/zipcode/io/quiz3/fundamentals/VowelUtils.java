package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        if (word.matches("[aeiou]+")) {
            return true;
        }  return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        return null;
    }


    public static Boolean startsWithVowel(String word) {
        return true;
    }

    public static Boolean isVowel(Character character) {
        return true;
    }
}
