import java.util.*;

public class ThirdMaxNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Call the method and print result
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinctCount = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                distinctCount++;
                if (distinctCount == 3) {
                    return nums[i]; // third maximum found
                }
            }
        }
        // If fewer than 3 distinct numbers, return the maximum
        return nums[nums.length - 1];
    }
}

/*- Sort the array
- Arrays.sort(nums); puts numbers in ascending order.
- Track distinct numbers from the end
- You start from nums.length - 2 (second last element) and move left.
- distinctCount starts at 1 because the last element (nums[nums.length-1]) is already counted as the first distinct maximum.
- Skip duplicates
- If nums[i] != nums[i+1], you found a new distinct number.
- Increase distinctCount.
- When distinctCount == 3, return that number → this is the third maximum.
- Fallback
- If fewer than 3 distinct numbers exist, return the largest (nums[nums.length-1]).
 */