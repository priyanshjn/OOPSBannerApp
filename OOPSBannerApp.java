/**
 * OOPSBannerApp
 * UC6 - Static Helper Methods Version
 * Modularized ASCII pattern generation
 *
 * @author Priyansh
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        // Combine letters to form OOPS
        for (int i = 0; i < o.length; i++) {
            String line = String.join("   ", o[i], o[i], p[i], s[i]);
            System.out.println(line);
        }
    }

    // Static method for letter O
    public static String[] buildO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Static method for letter P
    public static String[] buildP() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Static method for letter S
    public static String[] buildS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}