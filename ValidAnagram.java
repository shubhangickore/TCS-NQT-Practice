import java.util.*;

public class ValidAnagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if (s.length() != t.length()) {
            System.out.println("invalid");
            return;
        }

        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);

        if (Arrays.equals(cs, ct)) {
            System.out.println("valid anagram");
        }
    }

}
