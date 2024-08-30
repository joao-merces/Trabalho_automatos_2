package Util;

public class DiscoverAmmountLetters {
    public static int ammountLetters(String txt, char target) {
        int ammount = 0;
        int len = txt.length();

        for(int i = 0; i <= len; i++) {
            if (i == len) {
                return ammount;
            } else if (txt.charAt(i) == target) {
                ammount += 1;
            }
        }
        return ammount;
    }
}
