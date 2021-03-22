package Listen;

import java.util.Objects;

public class Rechteck {

    double länge;
    double breite;
    String name;

    public double calcFläche () {
        return länge * breite;
    }

    public double calcDiagonale () {
        double Diagonale = Math.sqrt(Math.pow(länge,2) + Math.pow(breite,2));
        return Diagonale;
    }

    public void print (){
        System.out.println("Das Listen.Rechteck " + name + " hat die Größe "
                + länge + "cm x " + breite + "cm, der Flächeninhalt ist: " + calcFläche() + ", die Diagonale beträgt: "+ calcDiagonale() + "cm.");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rechteck)) return false;
        Rechteck rechteck = (Rechteck) o;
        return Double.compare(rechteck.länge, länge) == 0 && Double.compare(rechteck.breite, breite) == 0 && name.equals(rechteck.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(länge, breite, name);
    }
}
