/**
 * OOPSBannerApp
 * UC5 - Array Declaration and Initialization in single statement
 * Using String.join() and enhanced for loop
 *
 * @author Priyansh
 * @version 5.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Array declared and initialized in single statement
        String[] banner = {
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", "*     *", "*     *", "*     *", "*      "),
            String.join("   ", "*     *", "*     *", " ***** ", " ***** "),
            String.join("   ", "*     *", "*     *", "*      ", "      *"),
            String.join("   ", "*     *", "*     *", "*     *", "*     *"),
            String.join("   ", " ***** ", " ***** ", " ***** ", " ***** ")
        };

        // Enhanced for loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }

    }
}
