package studyclass.java_1005.random;

public class RandomCalculator {
    private int random;

    public RandomCalculator(){
        random = (int)(Math.random()*10);
    }
    public void plus(int a){
        System.out.printf("%d + %d = %d\n", a, random, a+random);
    }
    public void minus(int a){
        System.out.printf("%d - %d = %d\n", a, random, a-random);
    }
    public void multiple(int a){
        System.out.printf("%d * %d = %d\n", a, random, a*random);
    }
    public void divide(int a){
        try{
            System.out.printf("%d / %d = %f\n", a, random, a/(float)random);
        }catch (ArithmeticException e){
            System.out.printf("%d / %d 오류발생\n", a, random);
        }

        System.out.println();
    }

}
