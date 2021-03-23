package Rekursion;

import java.util.Locale;

public class DemoStringSorting {

    public static void main(String[] args) {
        String s = "David Hasselhof";
        System.out.println(s);
        System.out.println(s.startsWith("Hass"));
        System.out.println(s.startsWith("Dav"));
        System.out.println("String -1.ter Buchstabe = " + s.substring(1));

        System.out.println();
        checkInhalt("Hallo", "Ha");
        System.out.println("checkInhalt Methode " + checkInhalt("Hallo", "al"));
        System.out.println("checkInhalt Methode " + checkInhalt("Hallo", "Hallo "));
        System.out.println("checkInhalt Methode " + checkInhalt("Hallo", "eal"));

        System.out.println();
        System.out.println("strstr Methode " + strstr("Hallo", "al"));
        System.out.println("strstr Methode " + strstr("Hallo", "Hallo "));


    }

    public static boolean checkInhalt(String s, String teil) {
        s = s.toLowerCase(Locale.ROOT);
        teil = teil.toLowerCase(Locale.ROOT);

        if (teil.length() > s.length())
            return false;
        while (teil.length() <= s.length()) {
            if (s == null || teil == null)
                return false;
            if (s.startsWith(teil))
                return true;
            else return checkInhalt((s.substring(1)), teil);
        }
        return checkInhalt(s, teil);
    }

    public static boolean strstr(String text, String part) {

        if (text == null || part == null)
            return false;
        if (text.length() < part.length())
            return false;
        if (text.length() == part.length())
            return text.equals(part);

        return text.startsWith(part) || strstr(text.substring(1), part);

    }
}
