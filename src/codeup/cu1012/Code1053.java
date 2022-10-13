package codeup.cu1012;

import java.util.Scanner;

public class Code1053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        switch (a) {
            case 1:
                System.out.println(0);
                break;
            case 0:
                System.out.println(1);
                break;
            default:
                System.out.println("0과1 중에 입력하여주세요.");
        }
    }
    //1
    //0
}
