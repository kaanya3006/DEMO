import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        charMap.put('P', new String[]{
                " ******  ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       "
        });

        charMap.put('S', new String[]{
                "  *****  ",
                " *       ",
                "  *****  ",
                "       * ",
                "  *****  "
        });

        return charMap;
    }

    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        if (message == null || message.isEmpty()) {
            System.out.println("Message is empty.");
            return;
        }

        message = message.toUpperCase();

        int patternHeight = charMap.get(message.charAt(0)).length;

        for (int line = 0; line < patternHeight; line++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                if (charMap.containsKey(ch)) {
                    System.out.print(charMap.get(ch)[line] + "  ");
                } else {
                    System.out.print("        "); 
                }
            }

            System.out.println(); 
        }
    }

  
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}