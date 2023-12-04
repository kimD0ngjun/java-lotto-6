package lotto.utility;

import java.util.List;
import lotto.view.message.ErrorMessage;

public class NumberValidator {
    public static void isValid(List<Integer> numbers) {
        validateLength(numbers);
        validateUnitRange(numbers);
        validateDuplicates(numbers);
    }

    private static void validateLength(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessage.SIX_TIMES.getMessage());
        }
    }

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 45;

    private static void validateUnitRange(List<Integer> numbers) {
        for(int number: numbers) {
            validateRange(number);
        }
    }

    // 보너스 번호에서도 재활용
    public static void validateRange(int number) {
        if (number < Math.min(MIN_RANGE, MAX_RANGE) || number > Math.max(MIN_RANGE, MAX_RANGE)) {
            throw new IllegalArgumentException(ErrorMessage.SIX_TIMES.getMessage());
        }
    }

    // 중복 여부 판별(보너스 번호에서 오버로딩 안되나)
    public static void validateDuplicates(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATES.getMessage());
        }
    }
}
