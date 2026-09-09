package ClassRoom_Tasks;

class Manacher {
    private final String original;
    int[] p;
    String ms;

    Manacher(String s) {
        original = s;
        ms = "@";
        for (char c : s.toCharArray()) {
            ms += "#" + c;
        }
        ms += "#$";

        runManacher();
    }

    private void runManacher() {
        int n = ms.length();
        p = new int[n];
        int l = 0, r = 0;

        for (int i = 1; i < n - 1; ++i) {
            int mirror = l + r - i;

            if (i < r) {
                p[i] = Math.min(r - i, p[mirror]);
            }

            while (ms.charAt(i + 1 + p[i]) == ms.charAt(i - 1 - p[i])) {
                ++p[i];
            }

            if (i + p[i] > r) {
                l = i - p[i];
                r = i + p[i];
            }
        }
    }

    int getLongest(int cen, int odd) {
        int pos = 2 * cen + 1 + odd;
        return p[pos];
    }

    boolean check(int l, int r) {
        if (l < 0 || r >= original.length() || l > r) {
            return false;
        }

        while (l < r) {
            if (original.charAt(l) != original.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

public class ClassRoom_Task10_ManacherPalindromeChecker {
    public static void main(String[] args) {
        String s = "ababa";
        Manacher manacher = new Manacher(s);

        System.out.println("Input: " + s);
        System.out.println("check(0, 4) -> " + manacher.check(0, 4));
        System.out.println("check(1, 3) -> " + manacher.check(1, 3));
        System.out.println("check(0, 2) -> " + manacher.check(0, 2));
        System.out.println("check(1, 2) -> " + manacher.check(1, 2));
        System.out.println("check(0, 1) -> " + manacher.check(0, 1));
        System.out.println("getLongest(cen=2, odd=1) -> " + manacher.getLongest(2, 1));
    }
}
