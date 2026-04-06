import java.util.*;

public class MergeSortedArr {
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int idx = m + n - 1; // pointer for placement in nums1

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[idx] = nums1[i];
                i--;
            } else {
                nums1[idx] = nums2[j];
                j--;
            }
            idx--;
        }

        // Copy remaining nums2 elements if any
        while (j >= 0) {
            nums1[idx] = nums2[j];
            j--;
            idx--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); // number of valid elements in nums1
        int n = sc.nextInt(); // number of elements in nums2

        int nums1[] = new int[m + n]; // nums1 has extra space
        int nums2[] = new int[n];

        // Read first m elements of nums1
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }

        // Fill remaining space with 0s (not necessary if default)
        for (int i = m; i < m + n; i++) {
            nums1[i] = 0;
        }

        // Read nums2
        for (int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}