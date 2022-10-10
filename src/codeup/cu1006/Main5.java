package codeup.cu1006;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 10000; i >= 1; i /= 10) {
            if (num / i != 0) {
                System.out.println("[" + num / i * i + "]");
                num %= i;
            }
        }
    }
    //75254
    //[70000]
    //[5000]
    //[200]
    //[50]
    //[4]
}
