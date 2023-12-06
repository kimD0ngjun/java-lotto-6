package lotto.domain.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LottoTest {
    // 테스트용 MockPurchase 클래스
    private static class MockPurchaseUnit extends PurchaseUnit {
        @Override
        public List<Integer> generatePurchase() {
            return Arrays.asList(7, 8, 9, 10, 11, 12);
        }
    }

    @DisplayName("입력된 당첨 번호는 부모 클래스에서 상속된 유효성 검사를 받는다")
    @Test
    void testValidation() {
        List<Integer> wrongCase1 = Arrays.asList(0, 45, 46, 47, 48, 49);
        List<Integer> wrongCase2 = Arrays.asList(1, 1, 1, 1, 1, 1);

        assertThrows(IllegalArgumentException.class, () -> {
            new Lotto(wrongCase1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Lotto(wrongCase2);
        });
    }

    @DisplayName("Purchase 클래스에서 생성된 구입 번호 단위와 비교해서 일치 개수를 반환한다.")
    @Test
    void testCountingSameNumbers() {
        PurchaseUnit mockPurchaseUnit = new MockPurchaseUnit();

        Lotto[] testCases = {
                new Lotto(Arrays.asList(1, 2, 3, 4, 5, 6)),
                new Lotto(Arrays.asList(7, 2, 3, 4, 5, 6)),
                new Lotto(Arrays.asList(7, 8, 3, 4, 5, 6)),
                new Lotto(Arrays.asList(7, 8, 9, 4, 5, 6)),
                new Lotto(Arrays.asList(7, 8, 9, 10, 5, 6)),
                new Lotto(Arrays.asList(7, 8, 9, 10, 11, 6)),
                new Lotto(Arrays.asList(7, 8, 9, 10, 11, 12))
        };

        int count = 0;

        for (Lotto testCase: testCases) {
            assertEquals(count, mockPurchaseUnit.compareNumbers(testCase));
            count++;
        }
    }
}
