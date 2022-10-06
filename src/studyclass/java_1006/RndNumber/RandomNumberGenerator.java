package studyclass.java_1006.RndNumber;

public class RandomNumberGenerator implements NumberGenerator{
    @Override
    public int generate(int num) {
        return (int)(Math.random() * num); // * num <- num 미만의 숫자로만
    }
}
