package lotto.controller;

import mvc.domain.entity.Entity;
import mvc.view.input.Input;
import mvc.view.input.Value;

public class InputController {
    public static Entity getInputValue() {
        while (true) {
            try {
                Input inputPrompt = new Value();
                String inputValue = inputPrompt.input();
                int inputNumber = Integer.parseInt(inputValue);
                return new Entity(inputNumber, inputValue);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}