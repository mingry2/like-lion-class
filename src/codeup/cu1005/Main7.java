package codeup.cu1005;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] time = sc.next().split(":");
        System.out.printf("%s:%s", time[0], time[1]);

    }

}
