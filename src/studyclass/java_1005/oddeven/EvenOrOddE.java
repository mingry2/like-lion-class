package studyclass.java_1005.oddeven;

public class EvenOrOddE implements Word{
    @Override
    public String getWord(int a) {
        // E - 짝수, 홀수를 odd, even 으로 반환
        if(a % 2 == 0){
            return "odd";
        }else {
            return "even";
        }
    }
}
