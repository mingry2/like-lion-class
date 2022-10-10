package codeup.cu1006;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("\\:");

        int hour = Integer.parseInt(date[0]);

        int minute = Integer.parseInt(date[1]);

        int second = Integer.parseInt(date[2]);

        System.out.printf("%d", minute);

    }
    //17:23:57
    //23
}
