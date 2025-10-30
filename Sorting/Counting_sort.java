import java.util.*;

public class Counting_sort {
    public static void counting_sort(int[] lst) {
        // counting sort, counts frequency of each element
        if (lst.length == 0)
            return;

        int max = Arrays.stream(lst).max().getAsInt();
        int min = Arrays.stream(lst).min().getAsInt();
        int range = max - min + 1;

        int[] count = new int[range];
        int[] output = new int[lst.length];

        // count each element
        for (int num : lst)
            count[num - min]++;

        // cumulative count
        for (int i = 1; i < range; i++)
            count[i] += count[i - 1];

        // place elements into output (reverse for stability)
        for (int i = lst.length - 1; i >= 0; i--) {
            output[count[lst[i] - min] - 1] = lst[i];
            count[lst[i] - min]--;
        }

        // copy back to lst
        for (int i = 0; i < lst.length; i++)
            lst[i] = output[i];
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 57, 12, 97, 36, 45, 2, 27, 79};
        System.out.println("Before: " + Arrays.toString(nums));
        System.out.println("sorting...");

        counting_sort(nums);

        System.out.println("After : " + Arrays.toString(nums));
    }
}
