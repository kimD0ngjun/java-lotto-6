package lotto.utility;

import java.util.List;
import lotto.view.message.ErrorMessage;

public class NumbersValidator {

    // 옳게 입력한 로또인가요
    public static void isValidLotto(List<Integer> numbers) {
        validateLength(numbers);
        validateUnitRange(numbers);
        validateDuplicates(numbers);
    }

    public static void validateLength(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(ErrorMessage.SIX_TIMES.getMessage());
        }
    }

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 45;

    public static void validateUnitRange(List<Integer> numbers) {
        for(int number: numbers) {
            validateRange(number);
        }
    }

    // 보너스 번호에서도 재활용
    public static void validateRange(int number) {
        if (number < Math.min(MIN_RANGE, MAX_RANGE) || number > Math.max(MIN_RANGE, MAX_RANGE)) {
            throw new IllegalArgumentException(ErrorMessage.RANGE.getMessage());
        }
    }

    // 중복 여부 판별
    public static void validateDuplicates(List<Integer> numbers) {
        if (numbers.stream().distinct().count() != numbers.size()) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATES.getMessage());
        }
    }

    // 옳게 입력한 보너스인가요
    public static void isValidBonus(List<Integer> lotto, int bonus) {
        validateRange(bonus);
        validateContain(lotto, bonus);
    }

    // 당첨 입력값과 보너스 입력값 비교
    public static void validateContain(List<Integer> lotto, int bonus) {
        if (lotto.contains(bonus)) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATES.getMessage());
        }
    }
}
