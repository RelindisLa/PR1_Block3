public class Sandpit {

    /* Klassen sind Datentypen
       Wenn als Datentypen gebraucht, haben keine main-Methode
       Klassen haben Attribute / Eigenschaften
     */

    double length;
    double width;
    double height;
    String name;
    double price;

    public double calVol () {
        return length * width * height;
    }

    public void print() {
        System.out.println("Wir benötigen für den " + name + " der Größe "
                + length + "m x " + width + "m x " + height + "m welche Menge Sand?");

    }
}
