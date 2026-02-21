public class OOPSBannerApp {

    // Method to generate letter O
    public static String[] getO() {
        return new String[] {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
    }

    // Method to generate letter P
    public static String[] getP() {
        return new String[] {
            " ***** ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        };
    }

    // Method to generate letter S
    public static String[] getS() {
        return new String[] {
            "  ***** ",
            " *      ",
            "  ***** ",
            "      * ",
            "      * ",
            " *****  "
        };
    }

    public static void main(String[] args) {

        String[] O = getO();
        String[] P = getP();
        String[] S = getS();

        // Combine letters row by row
        for (int i = 0; i < O.length; i++) {
            String line = String.join("   ", O[i], P[i], P[i], S[i]);
            System.out.println(line);
        }
    }
}