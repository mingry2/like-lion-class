package codeup.cu1014;

import java.util.Scanner;

public class Code1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char endAlphabet = 'q';
        boolean trueAndFalse = true;

        while (trueAndFalse) {
            char alphabet = sc.next().charAt(0);
            System.out.println(alphabet);
            if(alphabet == endAlphabet){
                trueAndFalse = false;
            }
        }
        //x b k d l q g a c
        //x
        //b
        //k
        //d
        //l
        //q
    }
}
