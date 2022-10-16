package codeup.cu1014;

import java.util.Scanner;

public class Code1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= 1000; i++){
            sum += i;
            if(sum == num){
                System.out.println(i);
            }
        }
    }
}
