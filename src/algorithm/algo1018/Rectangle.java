package algorithm.algo1018;

// 직사각형 만들기
public class Rectangle {
    public void printRectangle(int a, int b){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.printRectangle(3, 5);
    }
    //*****
    //*****
    //*****
}
