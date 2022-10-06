package studyclass.java_1005.oddeven;

public class EvenOrOddK implements Word{

    @Override
    public String getWord(int a) {
        // K - 짝수, 홀수를 짝수, 홀수로 반환
        if(a % 2 == 0){
            return "짝수";
        }else {
            return "홀수";
        }
    }
}
