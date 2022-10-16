package codeup.cu1014;

import java.util.Scanner;

public class Code1073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean trueOrFalse = true;

        while(trueOrFalse){
            int num = sc.nextInt();
            if(num != 0) {
                System.out.println(num);
            }else{
                trueOrFalse = false;
            }
        }
    }
    //7 4 2 3 0 1 5 6 9 10 8
    //7
    //4
    //2
    //3
}
