package algorithm.algo1011;

public class Solution {
    public int solution(int n){
        int result = 0;
        // int origin = n; 공간복잡도를 줄이기 위해 > n으로 변경해도 상관없음
        // for문 - 자릿수 때문에 어려움
        // while문 사용

//        System.out.println(n / 10); // 1234 / 10 몫 123
//        System.out.println(n % 10); // 나머지 4
//
//        System.out.println(n / 10); // 123 / 10 몫 12
//        System.out.println(n % 10); // 나머지 3
        while(n > 0){
            result += n % 10;
            n = n / 10; // 나머지 먼저 구해야함
            System.out.printf("origin:%d \nresult:%d \n", n, result);
        }
        return result;
    }

    public static void main(String[] args){
        Solution sod = new Solution();
        int result1 = sod.solution(1234);

        if(result1 == 10) {
            System.out.print("테스를 통과 했습니다.");
        }else {
            System.out.printf("테스트 실패 result: %d \n", result1);
        }
    }
}
