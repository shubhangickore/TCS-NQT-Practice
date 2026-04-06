import java.util.*;

public class Maxsumsubarray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        int start = 0, end = 0;
        int tempstart = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            // update max and indices
            currentsum += arr[i];
            if (currentsum > maxsum) {
                maxsum = currentsum;
                start = tempstart;
                end = i;
            }
            // reset if negatives
            if (currentsum < 0) {
                currentsum = 0;
                tempstart = i + 1;
            }
        }

        System.out.println("Maxsum :" + maxsum);

        System.out.println("subarray:");
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
