import java.util.*;

public class ReverseVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.print(reverseVowels(s));

    }

    public static String reverseVowels(String s) {

        char arr[] = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right && !isvowels(arr[left])) {
                left++;
            }

            while (left < right && !isvowels(arr[right])) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    public static boolean isvowels(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

}
