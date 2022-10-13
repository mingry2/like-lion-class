package codeup.cu1008;

import java.util.Scanner;

public class Code1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int plus = a + b + c;

        System.out.println(plus);
        System.out.printf("%.1f", plus / (float) 3);
    }
    //1 2 3
    //6
    //2.0
}
