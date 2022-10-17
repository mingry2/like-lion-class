package algorithm.algo1017;

public class RightTriangle {
    public void star(int num) {
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle();
        rt.star(4);
    }
}
