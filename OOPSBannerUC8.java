import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerUC8
 * UC8: Banner App using Class + Map
 * 
 * @author Sherylin
 * @version 8.0
 */

public class OOPSBannerUC8 {

    static Map<Character, CharacterPattern> bannerMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();
        printBanner("OOPS");

    }

    static void initializePatterns() {

        bannerMap.put('O', new CharacterPattern(new String[]{
                " ****** ",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                " ****** "
        }));

        bannerMap.put('P', new CharacterPattern(new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        }));

        bannerMap.put('S', new CharacterPattern(new String[]{
                " ******",
                "*      ",
                "*      ",
                " ******",
                "      *",
                "      *",
                "****** "
        }));

    }

    static void printBanner(String text) {

        for (int i = 0; i < 7; i++) {

            for (char c : text.toCharArray()) {
                System.out.print(bannerMap.get(c).getLine(i) + "  ");
            }

            System.out.println();
        }
    }
}