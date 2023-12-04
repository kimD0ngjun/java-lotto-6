package lotto.utility;

import java.util.List;

public class NumbersValidator {
    public static void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }
}
