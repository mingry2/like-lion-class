package codeup.cu1014;

import java.util.Scanner;

public class Code1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = 'a';
        char endAlphabet  = sc.next().charAt(0);
        while(alphabet <= endAlphabet) {
            System.out.printf("%s ", alphabet++);
        }
        //f
        //a b c d e f
    }
}
