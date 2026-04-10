import java.util.*; //The Ransom Note problem asks: Can we construct the string ransomNote using letters from the string magazine?  
                    //Each letter in magazine can only be used once.

public class RansomNote {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String ransomenote = sc.nextLine();
        String magazine = sc.nextLine();

        int count[] = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomenote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                System.out.println("false");
                return;
            }

            count[c - 'a']--;
        }

        System.out.println("true");

    }

}
