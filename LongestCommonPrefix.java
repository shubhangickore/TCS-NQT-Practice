import java.util.*;

public class LongestCommonPrefix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String strs[] = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }
        System.out.println(LongestCommonPrefix(strs));

    }

    public static String LongestCommonPrefix(String strs[]) {
        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) { // uses strs.length because it’s iterating over all strings.

            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);// uses prefix.length() because it’s trimming
                                                                  // characters from the prefix string itself.
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}