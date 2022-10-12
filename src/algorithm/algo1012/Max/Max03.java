package algorithm.algo1012.Max;

public class Max03 {
    // return ; maxVlue
    public int[] getMax(int[] arr){
        int maxIdx = 0;
        int maxValue = arr[0]; // arr이 모두 음수인 경우 0으로 하면 0이 max이기 때문에 0으로 초기화하지 않고 이렇게 초기화.
        for(int i = 1; i < arr.length; i++){ // 위의 변경으로 초기화하여 값이 3이 되니까 arr[0]인 3은 스캔할필요없음
            if(arr[i] > maxValue) {
                maxValue = arr[i];
                maxIdx = i;
            }
        }
        return new int[]{maxValue, maxIdx};
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 29, 38, 12, 57, 74, 40, 85, 61};
        arr = new int[]{-3, -29, -38, -12, -57, -74, -40, -85, -61};
        Max03 max03 = new Max03();
        int[] result = max03.getMax(arr);
        if(result[0] == -3 && result[1] == 0) {
            System.out.println("테스트를 통과 했습니다.");
        }else {
            System.out.println("테스트 실패 입니다. result" + result);
        }
    }
}
