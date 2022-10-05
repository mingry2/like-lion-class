package java_1005;

import java_1005.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,20);

        calculator.plus();
        calculator.minus();
        calculator.multiple();
        calculator.divide();
    }
}