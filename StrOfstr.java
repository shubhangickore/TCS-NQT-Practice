import java.util.*;

public class StrOfstr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        System.out.println(StrofStr(haystack, needle));

    }

    public static int StrofStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            // Loop through haystack starting positions where needle can fit
            // i goes from 0 up to n - m (last valid start index)

            if (haystack.substring(i, i + m).equals(needle)) {
                // Take substring of haystack from i to i+m (length m)
                // Compare it with needle
                return i; // If equal, return the starting index
            }
        }
        return -1;
    }
}
