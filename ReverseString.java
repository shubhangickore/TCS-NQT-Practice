public class ReverseString {
    public static void reverseString(char[] s) {
        int left = 0; // pointer at start
        int right = s.length - 1; // pointer at end

        // swap until pointers meet
        while (left < right) {
            char temp = s[left]; // store left char
            s[left] = s[right]; // put right char at left
            s[right] = temp; // put temp (old left) at right

            left++; // move forward
            right--; // move backward
        }
    }

    public static void main(String[] args) {
        char[] s = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
        System.out.println(java.util.Arrays.toString(s));
        // Output: [o, l, l, e, h]
    }
}
