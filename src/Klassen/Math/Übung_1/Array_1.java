package Klassen.Math.Übung_1;

import java.util.Arrays;

public class Array_1 {
    public static void main(String[] args) {

        /*Arrays speichern mehrere Werte desselben Types
        haben eine fixe Länge (Begrenzung der speicherbaren Einträge)
        Index startet bei 0 (NULL)
        TODO: Deklarieren:
        ElementType [] variabelName;
        TODO: Instanziierung:
        int[] punkte = new int [4]   >> 0,1,2,3,
        TODO: Initialisieren:
        int[] punkte = {17, 42, 99, 56}  >>wenn nicht initialisiert ist ausgabe: 0,0,0,0, oder NULL oder false
            TODO: [x] x ist der Operator
            String[] tage = {mo, di, mi, do ...}
            int i = 3;
        String tag1 = tage[i]: >>Mittwoch
        int anzahlTage = tage.LENGTH; (Array Länge)
        TODO: for (deklarieren, initialisieren, verändern)

         */


        //TODO: Übung:
        int[] array1 = {3,4,5};
        int[] array2 = {10, 20, 30};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println("Addiere je den ersten, zweiten u dritten Wert der Arrays miteinander: ");

        int sum1=0, sum2=0;
        for (int i = 0; i < array1.length; i++) {
            sum1=sum1+array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2=sum2+array2[i];
        }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println();
        System.out.println("Multipliziere je den ersten, zweiten u dritten Wert der Arrays miteinander: ");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] * array2[i]);
            }

        System.out.println();



        String[] monate = {"Jan", "Feb", "März", "April", "Mai", "Juni", "Juli", "Aug", "Sept", "Okt", "Nov", "Dez"};
        for (int i = 0; i < monate.length; i++) {
            System.out.println(monate[i] + " [" + (i+1) + "]" );

        }

    }

    /*public static float multiplArray (int[] array1, int[] array2){
        int[] ergebnisArray;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                ergebnisArray[i] = array1[i] * array2[j];
            }

        }
        return ergebnisArray[];
    }

     */
}
