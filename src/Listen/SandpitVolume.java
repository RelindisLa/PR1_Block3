package Listen;

public class SandpitVolume {
    public static void main(String[] args) {
        //Volumensberechner:
        //Länge x Breite x Höhe = Volumen

        // Var. 1: eines nach dem anderen eingeben
        /*double l = 1.4;
        double w = 1.4;
        double h = 0.2;
        String name = "Homemade Listen.Sandpit";
        double price = 0;
        System.out.println("Wir benötigen für den " + name + " der Größe "
                + l + "m x " + w + "m x " + h + "m folgende Menge Sand: " + calculadeVolume(l, w, h) + " m³.");

        double lB = 1.5;
        double wB = 1.5;
        double hB = 0.26;
        String nameBauhaus = "Bauhaus Listen.Sandpit";
        double priceB = 59;
        System.out.println("Wir benötigen für den " + nameBauhaus + " der Größe "
                + lB + "m x " + wB + "m x " + hB + "m folgende Menge Sand: " + calculadeVolume(lB, wB, hB) + " m³.");
         */

        // Var. 2: je Dimension ein Array, je Index ein Produkt
        // Var. 3: Template erstellen

        Sandpit homeMade = new Sandpit();
        Sandpit bauHaus = new Sandpit();
        Sandpit wickey = new Sandpit();

        homeMade.height = 0.2;
        homeMade.length = 1.4;
        homeMade.width = 1.4;
        homeMade.name = "Selbstgemacht";
        homeMade.price = 0;
        homeMade.print();
        System.out.println(homeMade.name + " kostet " + homeMade.price +
                " und wir benötigen " + homeMade.calVol() + "m³ Sand.");

        bauHaus.height = 0.26;
        bauHaus.length = 1.5;
        bauHaus.width = 1.5;
        bauHaus.name = "Bauhaus Original";
        bauHaus.price = 59;
        bauHaus.print();
        System.out.println(bauHaus.name + " kostet " + bauHaus.price +
                " und wir benötigen " + bauHaus.calVol() + "m³ Sand.");


        wickey.height = 0.4;
        wickey.length = 1.4;
        wickey.width = 1.4;
        wickey.print();
        wickey.name = "Wickey, Made in Austia";
        wickey.price = 299;
        System.out.println(wickey.name + " kostet " + wickey.price +
                " und wir benötigen " + wickey.calVol() + "m³ Sand.");


    }

    public static double calculadeVolume (double lenght, double width, double height) {
        return lenght * width * height;
    }
}
