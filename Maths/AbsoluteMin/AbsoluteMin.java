package AbsoluteMin;

import java.util.Arrays;

/**
 * Algorithm that finds the absolute min value among the given numbers.
 */
public class AbsoluteMin {

    public static int getMinValue(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Numbers array cannot be empty");
        }

        var absMinWrapper = new Object() { int value = numbers[0]; };

        Arrays.stream(numbers).skip(1).filter(number -> Math.abs(number) < Math.abs(absMinWrapper.value)).forEach(number -> absMinWrapper.value = number);

        return absMinWrapper.value;
    }
}
