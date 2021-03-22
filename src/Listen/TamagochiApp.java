package Listen;

public class TamagochiApp {

    public static void main(String[] args) {

    Tamagochi dummy = new Tamagochi();

    dummy.name = "Dummy";
    dummy.Futter = 5;
    dummy.x = 6;
    dummy.y = 4;
    //Ziel Dummy soll x = 0, Y = 0 erreichen

    Tamagochi susi = new Tamagochi();
    susi.name = "Susi";
    susi.Futter = 5;
    susi.x = 1;
    susi.y = 1;


    String demo = new String("hallo");
    String  demo1 = "Hallo";

    System.out.println("x: " + dummy.x + "; y: " + dummy.y + "; Futterstatus: " + dummy.Futter);
    dummy.feed(1);
    dummy.move("left", 5);
    System.out.println("x: " + dummy.x + "; y: " + dummy.y + "; Futterstatus: " + dummy.Futter);
    dummy.feed(5);
    dummy.move("left", 1);
    dummy.move("down", 4);
    System.out.println("x: " + dummy.x + "; y: " + dummy.y + "; Futterstatus: " + dummy.Futter);


    }
}
