package lotto.controller;

import static lotto.utility.NumbersValidator.validateRange;
import static lotto.utility.TypeValidator.isNumberType;
import static lotto.utility.TypeValidator.splitAndParseInt;

import java.util.List;
import lotto.view.input.Bonus;
import lotto.view.input.Input;
import lotto.view.input.Lotto;
import lotto.view.input.Purchase;

public class InputController {
    public int getInputPurchase() {
        while (true) {
            try {
                Input input = new Purchase();
                String inputValue = input.inputValue();
                isNumberType(inputValue);
                return Integer.parseInt(inputValue);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public List<Integer> getInputLotto() {
        while (true) {
            try {
                Input input = new Lotto();
                String inputValue = input.inputValue();
                List<Integer> lotto = splitAndParseInt(inputValue);
                return lotto;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getInputBonus() {
        while (true) {
            try {
                Input input = new Bonus();
                String inputValue = input.inputValue();
                isNumberType(inputValue);
                int bonus = Integer.parseInt(inputValue);
                validateRange(bonus); // 추가로 로또 번호랑 중복되는지도 확인 필요
                return bonus;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
