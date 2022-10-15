package codeup.cu1013;

import java.util.Scanner;

public class Code1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 90){
            System.out.println("A");
        }else if(a >= 70){
            System.out.println("B");
        }else if(a >= 40){
            System.out.println("C");
        }else if(a > 100){
            System.out.println("1~100 사이 숫자를 입력해주세요.");
        }else{
            System.out.println("D");
        }
        //73
        //B
    }
}
