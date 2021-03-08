public class Turmrechnen1 {
    public static void main(String[] args) {


    long startValue = 202103;

    for (long i = 0; i <= 9; i ++) {
            System.out.println( startValue + " * " + i);
            startValue = startValue * i;
        }
        for (long i = 2; i <= 9; i++) {
            System.out.println(startValue + " / " + i);
            startValue = startValue / i;

        }
        System.out.println(startValue);
    }


}
