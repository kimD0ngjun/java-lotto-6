package lotto.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoGeneratorTest {
    @DisplayName("로또 번호 생성 길이는 6이다.")
    @Test
    void testSizeOfNumbers() {
        LottoGenerator lottoGenerator = new LottoGenerator();
        List<Integer> testNumbers = lottoGenerator.generateNumbers();

        assertThat(testNumbers).hasSize(6);
    }

    @DisplayName("로또 번호는 단위 간에 서로 중복되지 않는다.")
    @Test
    void testDuplicates() {
        LottoGenerator lottoGenerator = new LottoGenerator();
        List<Integer> testNumbers = lottoGenerator.generateNumbers();

        assertThatCode(() -> assertThat(testNumbers).doesNotHaveDuplicates())
                .doesNotThrowAnyException();
    }

    @DisplayName("로또 번호는 오름차순으로 나열된다.")
    @Test
    void testAscending() {
        LottoGenerator lottoGenerator = new LottoGenerator();
        List<Integer> testNumbers = lottoGenerator.generateNumbers();

        assertThat(testNumbers).isSorted();
    }
}
