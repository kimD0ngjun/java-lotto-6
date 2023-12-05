package lotto.domain.entity.numbers;

import java.util.List;
import lotto.utility.NumbersValidator;

public class Numbers {
    public void isValidNumbers(List<Integer> numbers) {
        NumbersValidator.validateLength(numbers);
        NumbersValidator.validateUnitRange(numbers);
        NumbersValidator.validateDuplicates(numbers);
    }
}
