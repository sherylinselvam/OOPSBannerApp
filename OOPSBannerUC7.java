import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerUC7
 * UC7: Banner using Map and Functions
 * 
 * @author Sherylin
 * @version 7.0
 */

public class OOPSBannerUC7 {

    static Map<Character, String[]> bannerMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();
        printBanner("OOPS");

    }

    static void initializePatterns() {

        bannerMap.put('O', new String[]{
                " ****** ",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                "*      *",
                " ****** "
        });

        bannerMap.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        bannerMap.put('S', new String[]{
                " ******",
                "*      ",
                "*      ",
                " ******",
                "      *",
                "      *",
                "****** "
        });
    }

    static void printBanner(String text) {

        for (int i = 0; i < 7; i++) {

            for (char c : text.toCharArray()) {
                String[] pattern = bannerMap.get(c);
                System.out.print(pattern[i] + "  ");
            }

            System.out.println();
        }
    }
}