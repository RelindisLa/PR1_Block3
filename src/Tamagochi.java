public class Tamagochi {

    int x;
    int y;
    int Futter;
    String name;


    public void feed (int box) {
        Futter += box;
    }

    public void move (String direction, int steps) {
        //directiion = left, right, up, down

        if (direction.equalsIgnoreCase("left")) {
            x = x - steps;
        }
        else if (direction.equalsIgnoreCase("up")) {
            y = y + steps;
        }
        else if (direction.equalsIgnoreCase("right")) {
            x = x + steps;
        }
        else if (direction.equalsIgnoreCase("down")) {
            y = y - steps;
        }
        else {
            System.out.println("ungültige richtung");
        }
        Futter -= steps;
    }

}
