import java.util.*;

public class Exponential{
    public static int binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    public static int exponentialSearch(int[] arr, int target) {
        if (arr.length == 0) return -1;
        if (arr[0] == target) return 0;

        int i = 1;
        // keep doubling till we pass target or reach end
        while (i < arr.length && arr[i] <= target)
            i *= 2;

        return binarySearch(arr, i / 2, Math.min(i, arr.length - 1), target);
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 57, 12, 97, 36, 45, 2, 27, 79};
        Arrays.sort(nums);
        System.out.println("Searching in: " + Arrays.toString(nums));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int x = sc.nextInt();

        int res = exponentialSearch(nums, x);
        if (res != -1)
            System.out.println("Found at index " + res);
        else
            System.out.println("Not found :(");
    }
}
