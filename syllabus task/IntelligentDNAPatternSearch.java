import java.util.*;

public class IntelligentDNAPatternSearch {

    public static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        // Create LPS array
        int[] lps = new int[m];

        int len = 0;
        int i = 1;

        while (i < m) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        // KMP Pattern Search
        i = 0;
        int j = 0;
        boolean found = false;

        while (i < n) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }

            if (j == m) {
                System.out.print((i - j) + " ");
                found = true;
                j = lps[j - 1];
            } 
            else if (i < n && text.charAt(i) != pattern.charAt(j)) {

                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        if (!found) {
            System.out.print("-1");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        search(text, pattern);

        sc.close();
    }
}