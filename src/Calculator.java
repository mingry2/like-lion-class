public class Calculator {
    float chFloat = 0;
    public void plus(int first, int second) {
        // Date Access Object
        System.out.println(first + second);
    }
    public void minus(int first, int second) {
        System.out.println(first - second);
    }
    public void multiple(int first, int second) {
        System.out.println(first * second);
    }
    public void divide(int first, int second) {
        float chFloat = (float)first/second;
        System.out.println(chFloat);
    }
}

