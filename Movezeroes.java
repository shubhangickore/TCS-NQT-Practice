import java.util.*;

public class Movezeroes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i] + "");
        }

    }

}
