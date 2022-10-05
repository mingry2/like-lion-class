package java_1005;

public class Calculator {
    // 생성자 추가 단축키 alt + ins
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void plus() {
        // Date Access Object
        System.out.println(a + b);
    }
    public void minus() {
        System.out.println(a - b);
    }
    public void multiple() {
        System.out.println(a * b);
    }
    public void divide() {
        float result = (float)a/b;
        System.out.println(result);
    }
}

