package lotto.domain.entity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import lotto.domain.entity.purchase.Purchase;
import lotto.domain.entity.purchase.SimplePurchase;
import lotto.service.Generator;
import lotto.service.PurchaseNumbersGenerator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PurchaseTest {
    // 테스트용 Mock PurchaseNumbersGenerator 클래스
    private static class MockPurchaseNumbersGenerator extends PurchaseNumbersGenerator {
        @Override
        public List<Integer> generateNumbers() {
            return Arrays.asList(1, 2, 3, 4, 5, 6);
        }
    }

    private static List<List<Integer>> generatedNumbers;

    @BeforeAll
    static void setUp() {
        Generator mockGenerator = new MockPurchaseNumbersGenerator(); // 자동 타입 변환
        Purchase purchase = new SimplePurchase("10000", mockGenerator); // 자동 타입 변환

        generatedNumbers = purchase.repeatGenerator();
    }

    @DisplayName("로또 번호 생성기는 입력 금액 / 1000 만큼의 개수가 출력된다.")
    @Test
    void testRepeatGenerator() {
        assertThat(generatedNumbers).hasSize(10);
    }

    @DisplayName("로또 번호 생성기의 각 단위 로또 번호의 길이는 6이다.")
    @Test
    void testUnitNumbersLength() {
        for (List<Integer> numbers : generatedNumbers) {
            assertThat(numbers).hasSize(6);
        }
    }

    @DisplayName("로또 번호 생성기에서 반환된 리스트의 각 요소들이 중복되지 않는다.")
    @Test
    void testUnitNumbersDuplicates() {
        for (List<Integer> numbers : generatedNumbers) {
            assertThatCode(() -> assertThat(numbers).doesNotHaveDuplicates())
                    .doesNotThrowAnyException();
        }
    }

    @DisplayName("로또 번호 생성기에서 반환된 리스트는 오름차순으로 나열된다.")
    @Test
    void testUnitNumbersAscending() {
        for (List<Integer> numbers : generatedNumbers) {
            assertThat(numbers).isSorted();
        }
    }

    @DisplayName("숫자 이외의 값을 입력하면 예외 처리된다")
    @Test
    void testNumberFormatException() {
        Generator generator = new MockPurchaseNumbersGenerator();

        assertThrows(IllegalArgumentException.class, () -> {
            new SimplePurchase("삼천원", generator);
        });
    }

    @DisplayName("1,000원 단위가 아닌 값을 입력하면 예외 처리된다")
    @Test
    void testThousandsUnitException() {
        Generator generator = new MockPurchaseNumbersGenerator();

        assertThrows(IllegalArgumentException.class, () -> {
            new SimplePurchase("3200", generator);
        });
    }
}