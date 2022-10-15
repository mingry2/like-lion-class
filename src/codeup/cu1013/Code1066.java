package codeup.cu1013;

import java.util.Scanner;

public class Code1066 {
    public void evenOdd(int x){
        if(x % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Code1066 code1066 = new Code1066();

        code1066.evenOdd(a);
        code1066.evenOdd(b);
        code1066.evenOdd(c);

    }
    //1 2 8
    //odd
    //even
    //even
}
