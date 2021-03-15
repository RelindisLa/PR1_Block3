import java.sql.SQLOutput;
import java.util.Arrays;

public class Übungsblatt4 {

    public static void main(String[] args) {
        /*Geben Sie alle Zahlen zwischen 1 und 100
        mittels einer for-Schleife und einer while-Schleife aus.
        Erstellen Sie hierzu eine neue Klasse
        und lösen Sie die Aufgabenstellung direkt in der Main-Methode
         */
        resultEx5String();
        resultEx5();

        System.out.println("Nummern von 1 bis 100: " + Arrays.toString(printNumbersOneToHWhile()));
        //System.out.println("Nummern von 1 bis 100: " + printNumbersOneToHFor());

        System.out.println("Nummern von 100 bis 1: " + Arrays.toString(printNumbersHToOneWhile()));

    }

    public static int[] printNumbersOneToHWhile() {
        int sum = 0, counter = 0, i = 0;

        int [] gefundeneZahlen = new int [100];

        while ( i < 100 ) {
            i++;
            gefundeneZahlen[counter] = i;
            counter++;
        }
        return gefundeneZahlen;
    }

    public static int[] printNumbersHToOneWhile() {
        int sum = 0, counter = 100, i = 100;

        int [] gefundeneZahlen = new int [100];

        while ( i >= 1 ) {
            i--;
            counter--;
            gefundeneZahlen[counter] = i;
        }
        return gefundeneZahlen;
    }

    /*public static int[] printNumbersOneToHFor() {
     public class S4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}

     */

    public static void resultEx5 () {

        for (int zeile = 0; zeile <= 9; zeile++) {
            System.out.println();
            for (int i = 0; i <= 9; i++) {
                System.out.print(i + ", ");
            }
        }

    }

    public static void resultEx5String () {
        String zeile = "Zeile: ";
        for (int i =0; i <= 9; i ++) {
            zeile = zeile +i + ", ";
            System.out.println(zeile);}

    }






}
