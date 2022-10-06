package studyclass.java_1006.numalphabet;

public class RandomAlphabetGenerator implements AlphabetGenerator{

    @Override
    public Character generate(int num) {
        int rndNum = (int)(Math.random() * 26);
        char alphabet = (char)(rndNum + 64);
        return alphabet;
    }
}
