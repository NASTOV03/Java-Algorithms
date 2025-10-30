import java.util.*;

public class Shell_sort {
    public static void shell_sort(int[] lst) {
        // shell sort, reduces the gap each time
        int n = lst.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            // do a gapped insertion sort
            for (int i = gap; i < n; i++) {
                int temp = lst[i];
                int j = i;

                while (j >= gap && lst[j - gap] > temp) {
                    lst[j] = lst[j - gap];
                    j -= gap;
                }
                lst[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 57, 12, 97, 36, 45, 2, 27, 79};
        System.out.println("Before: " + Arrays.toString(nums));
        System.out.println("sorting...");

        shell_sort(nums);

        System.out.println("After : " + Arrays.toString(nums));
    }
}
