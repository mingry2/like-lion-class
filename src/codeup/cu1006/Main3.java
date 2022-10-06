package codeup.cu1006;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] num = sc.nextLine().split("\\.");

        System.out.println(num[0]);
        System.out.println(num[1]);
    }
    /*
    1.414213
    1
    414213
    */
}
