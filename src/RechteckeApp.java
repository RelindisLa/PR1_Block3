public class RechteckeApp {

    public static void main(String[] args) {

        Rechteck A = new Rechteck();
        Rechteck B = new Rechteck();
        Rechteck C = new Rechteck();

        A.länge = 3;
        A.breite = 4;
        A.name = "A";

        B.länge = 80;
        B.breite = 100;
        B.name = "B";

        C.länge = -80;
        C.breite = -100;
        C.name = "C";

        A.print();
        B.print();
        C.print();
    }
}
