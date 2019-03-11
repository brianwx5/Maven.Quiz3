package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
//        Stream<SomeType> oddNumbers = Arrays.stream(array).collect(Collectors.partitioningBy(this::isOddorEven);
        return null;
    }

    public SomeType findEvenOccurringValue() {
        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for (SomeType iteration: array
             ) {
            if(iteration == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public Boolean isOddorEven(SomeType x) {
        if(getNumberOfOccurrences(x) % 2 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
