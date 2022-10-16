package codeup.cu1014;

import java.util.Scanner;

public class Code1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    //5
    //6
}
