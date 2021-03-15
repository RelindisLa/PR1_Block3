public class Schaltjahr {

    public static void main(String[] args) {
        int year = 0;

        System.out.println(isLeapYear());





    }

    public static int isLeapYear (int year) {
        int counter = 0;
        for (int i = 1;i <= 2100;i++){
            if (i % 4 == 0) {
                System.out.print(i + ", ");
                counter++;
            }

            if (i % 100 == 0){
                System.out.println( i + "-> kein Schaltjahr");
            }

            if ( i % 400 == 0) {
                System.out.println(i + " ist ein Schaltjahr");
            }
        }
        return counter;

    }
}
