package algorithm.algo1012.Max;

import java.util.Arrays;

public class Max01 {

    public int[] getMaxValue(int[] arr){
        int maxValue = 0;
        int maxInd = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxInd = i+1;
            }
        } return new int[]{maxValue, maxInd};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        Max01 max01 = new Max01();

        int[] result = max01.getMaxValue(arr);
//        if(result == 85){
//            System.out.println("테스트를 통과하였습니다.");
//        }else {
//            System.out.printf("통과하지 못하였습니다. / result : %d", result);
//        }
        System.out.println(Arrays.toString(result));
    }

}
