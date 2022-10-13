package algorithm.algo1013;

import java.util.Arrays;

public class Sort {

    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }return arr;
    }
        public static void main (String[]args){
            int[] arr = new int[]{7, 2, 3, 9, 28, 11};

            Sort sort = new Sort();
            int[] result = sort.sort(arr);
            System.out.println(Arrays.toString(result));

        }
    }

