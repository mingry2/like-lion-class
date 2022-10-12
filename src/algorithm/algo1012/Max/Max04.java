package algorithm.algo1012.Max;

import java.util.Arrays;

public class Max04 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3,23,85,34,17,74,25,52,65},
                {10,7,39,42,88,52,14,72,63},
                {87,42,18,78,53,45,18,84,53},
                {34,28,64,85,12,16,75,36,55},
                {21,77,45,35,28,75,90,76,1},
                {25,87,65,15,28,11,37,28,74},
                {65,27,75,41,7,89,78,64,39},
                {47,47,70,45,23,65,3,41,44},
                {87,13,82,38,31,12,29,29,80}
        };
        int maxValue = arr[0][0];
        int[] maxInd = {0,0};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] > maxValue){
                    maxValue = arr[i][j];
                    maxInd[0] = i;
                    maxInd[1] = j;
                }
            }
        }
        System.out.println(maxValue);
        System.out.println(Arrays.toString(maxInd));
    }
}
