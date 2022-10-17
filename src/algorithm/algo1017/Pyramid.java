package algorithm.algo1017;

public class Pyramid {
    public void printPyramid(int num){
        for (int i = 0; i < num; i++) {
            for(int j = num - 1 - i; j > 0; j--){
                System.out.print("0");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pyramid pa = new Pyramid();
        pa.printPyramid(4);

    }
}
