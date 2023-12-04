package lotto.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lotto.domain.entity.numbers.Lotto;
import lotto.domain.entity.numbers.Number;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoTest {
    private static List<Integer> numbers;

    @BeforeAll
    static void setUp() {
        numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    }

    @DisplayName("당첨 번호와 구입 번호를 비교해서 일치 번호 개수를 반환한다.")
    @Test
    void testSameNumbers() {
        List<Integer> testNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 7));
        Number lotto = new Lotto(testNumbers);

        assertEquals(5, lotto.compareNumbers(numbers));
    }
}
