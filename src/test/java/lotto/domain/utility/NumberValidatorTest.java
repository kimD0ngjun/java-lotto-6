package lotto.domain.utility;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;
import lotto.utility.NumberValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class NumberValidatorTest {
    @DisplayName("당첨 번호와 보너스 번호가 중복되면 예외 처리된다.")
    @Test
    void testContain() {
        List<Integer> testLotto = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        int testBonus = 5;

        assertThatThrownBy(() -> NumberValidator.validateContain(testLotto, testBonus))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
