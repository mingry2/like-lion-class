package babalion.day3;

public class GuguDan {
    public void printGugudan(int dan){
        for(int i = 1; i <= 9; i++){
            System.out.println(dan * i);
        }
    }
    public void printPlus(int dan){
        for(int i = 1; i <= 9; i++){
            System.out.println(dan + i);
        }
    }

    public static void main(String[] args) {
        GuguDan gugudan = new GuguDan();
        for(int j = 2; j <=9; j++) {
            gugudan.printGugudan(j);
        }
    }
}
