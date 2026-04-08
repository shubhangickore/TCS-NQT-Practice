import java.util.*;

public class MinMaxFreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Step 1: Build frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find min and max frequency
        int minfreq = Integer.MAX_VALUE;
        int maxfreq = Integer.MIN_VALUE;

        for (int val : freq.values()) {
            minfreq = Math.min(minfreq, val);
            maxfreq = Math.max(maxfreq, val);
        }

        // Step 3: Print results
        System.out.print("Minimum frequency element(s): ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == minfreq) {
                System.out.print(entry.getKey() + " ");
            }
        }
        System.out.println();

        System.out.print("Maximum frequency element(s): ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == maxfreq) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
