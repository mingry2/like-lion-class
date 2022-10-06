package codeup.cu1005;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] date = sc.next().split("\\.");

        int year = Integer.parseInt(date[0]);

        int month = Integer.parseInt(date[1]);

        int day = Integer.parseInt(date[2]);


        System.out.printf("%04d.%02d.%02d", year, month, day);

    }
    /*
    99.1.1
    0099.01.01
     */
}
