package lotto.domain.entity;

import java.util.ArrayList;
import java.util.Arrays;
import lotto.domain.entity.numbers.Lotto;
import lotto.domain.entity.numbers.Number;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LottoTest {
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

    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 범위를 넘어서는 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByOverRangedNumber() {
        assertThatThrownBy(() -> new Lotto(List.of(0, 2, 3, 4, 5, 46)))
                .isInstanceOf(IllegalArgumentException.class);
    }
}