/**
 * OOPSBannerUC6
 * 
 * UC6: Print OOPS Banner using Static Function
 * 
 * @author Sherylin
 * @version 6.0
 */

public class OOPSBannerUC6 {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        String[] banner = {
            " ********   ********   ******     ******** ",
            "*        * *        * *      *    *        *",
            "*        * *        * *      *    *         ",
            "*        * *        * ******      ******** ",
            "*        * *        * *           *        *",
            "*        * *        * *           *        *",
            " ********   ********  *            ******** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}