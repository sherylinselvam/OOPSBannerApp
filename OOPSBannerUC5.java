/**
 * OOPSBannerUC5
 *
 * UC5: Print OOPS Banner using Array Initialization
 *
 * @author Sherylin
 * @version 5.0
 */

public class OOPSBannerUC5 {

    public static void main(String[] args) {

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