package codeup.cu1006;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] word = sc.next().split("");

        for (int i = 0; i < word.length; i++){
            System.out.println("\'" +  word[i] + "\'");
        }

    }
    /*
    teacher
    't'
    'e'
    'a'
    'c'
    'h'
    'e'
    'r'
     */
}
