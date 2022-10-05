package studyclass.java_1005.calculator1;


public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new BypassNumberCreator());
        calculator.plus(30);
    }
}
