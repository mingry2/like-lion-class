package studyclass.java_1005.oddeven;

public class Judge {
    private Word word;

    public Judge(Word word){
        this.word = word;
    }

    public void result(int a, int b) {
        System.out.println(word.getWord(a)+" + "+word.getWord(b)+" = "+word.getWord(a+b));
    }


}
