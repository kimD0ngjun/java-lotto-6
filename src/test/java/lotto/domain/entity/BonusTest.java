package lotto.domain.entity;

import static org.junit.jupiter.api.Assertions.assertThrows;

import lotto.domain.entity.numbers.Bonus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BonusTest {
    @DisplayName("보너스 번호의 범위는 1부터 45까지다.")
    @Test
    void testRange() {
        int[] testCases = {-30, 0, 46};

        for(int testCase: testCases) {
            assertThrows(IllegalArgumentException.class, () -> {
                new Bonus(testCase);
            });
        }
    }
}
