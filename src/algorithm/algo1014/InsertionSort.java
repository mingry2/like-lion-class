package algorithm.algo1014;

import java.util.Arrays;

public class InsertionSort {
    public int[] sort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            for(int j = i; j > 0; j--){
//              System.out.printf("i:%d , j:%d , j-1:%d\n", i,j,j-1);
                if(arr[j] < arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    return arr;
}

    public static void main(String[] args) {
        // 삽입정렬은 출발이 5 인덱스[1] 부터 시작!
        int[] arr = {8, 5, 6, 2, 4};
        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);

        System.out.println(Arrays.toString(result));

    }
}
