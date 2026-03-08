package OOPSBannerApp;

public class OOPSBannerAppUC5 {
        public static void main(String[] args) {

        // Inline declaration + initialization
        String[] lines = {
                String.join(" ", " ***  ", "  ", " ***  ", "  ", "***** ", "  ", " **** "),
                String.join(" ", "*   * ", "  ", "*   * ", "  ", "*    *", "  ", "*     "),
                String.join(" ", "*   * ", "  ", "*   * ", "  ", "*    *", "  ", "*     "),
                String.join(" ", "*   * ", "  ", "*   * ", "  ", "***** ", "  ", " ***  "),
                String.join(" ", "*   * ", "  ", "*   * ", "  ", "*     ", "  ", "    * "),
                String.join(" ", "*   * ", "  ", "*   * ", "  ", "*     ", "  ", "    * "),
                String.join(" ", " ***  ", "  ", " ***  ", "  ", "*     ", "  ", "****  ")
        };

        // Print using loop
        for (String line : lines) {
            System.out.println(line);
        }
    }

}
