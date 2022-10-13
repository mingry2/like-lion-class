package codeup.cu1008;

import java.util.Scanner;

public class Code1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.printf("%.2f", a/(float)b);
    }
    //10 3
    //13
    //7
    //30
    //3
    //1
    //3.33

}
