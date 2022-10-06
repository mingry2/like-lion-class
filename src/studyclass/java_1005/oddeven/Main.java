package studyclass.java_1005.oddeven;

public class Main {
    public static void main(String[] args) {

        Judge judge = new Judge(new EvenOrOddK());
        judge.result(5,6);

        judge = new Judge(new EvenOrOddE());
        judge.result(5,6);

    }
}
