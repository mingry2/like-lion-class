package algorithm.algo1017;

public class LetterPrint {
    private String letter = "*";

    public LetterPrint(){

    }

    public LetterPrint(String letter) {
        this.letter = letter;
    }

    public void printStar(int num) {
        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LetterPrint lt = new LetterPrint("#");
        lt.printStar(4);


    }
}
