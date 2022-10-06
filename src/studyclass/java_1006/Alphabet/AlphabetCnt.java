package studyclass.java_1006.Alphabet;

public class AlphabetCnt {

    public boolean isAlphabet(char c) {
        if (c >= 97) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s1 = "aabbccddeefghijkkkkkllm";
        // String을 한글자씩 출력할 수 있어야 한다.
//        for(int i = 0; i < s1.length(); i++){
//            System.out.println(s1.charAt(i));
//        }

        AlphabetCnt alphabetCnt = new AlphabetCnt();

        boolean b1 = alphabetCnt.isAlphabet(s1.charAt(4));
        System.out.println(b1);

//        System.out.println(s1.charAt(0));
//        System.out.println(s1.charAt(s1.length() -1));
    }
}
