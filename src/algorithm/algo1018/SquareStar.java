package algorithm.algo1018;

// 정사각형 만들기
public class SquareStar {
    public void printSquareStar(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        SquareStar ss = new SquareStar();
        ss.printSquareStar(4);
    }
    //****
    //****
    //****
    //****
}
