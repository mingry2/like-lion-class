package studyclass.java_1006.numalphabet;

public class RndAlphabetWithoutDuplicated {
    public static void main(String[] args) {
        RandomAlphabetGenerator randomAlphabetGenerator = new RandomAlphabetGenerator();
        char alphabet = randomAlphabetGenerator.generate(0);
        System.out.println(alphabet);

    }
}
