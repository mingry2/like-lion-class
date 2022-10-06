package codeup.cu1005;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        char x;

        Scanner sc = new Scanner(System.in);
        x = sc.next().charAt(0);

        System.out.printf("%c", x);

        sc.close();
    }
}
