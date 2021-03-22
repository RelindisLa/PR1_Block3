package Übungen_1;

public class ZinsDemo {
    public static void main(String[] args) {

        double kontostand = 1000;
        double zinsen = 2.5;

        System.out.println("bei Zinsen von " + zinsen + "%, erhält man beim Kontostand von € " + kontostand + " folgende Zinsen: " + neuerKonsostand(kontostand, zinsen));


    }

    public static double neuerKonsostand (double kontostand, double zinsen) {
        double konostandNeu;
        konostandNeu = kontostand/100 * zinsen;
        return konostandNeu;
    }


}
