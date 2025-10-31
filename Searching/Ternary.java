import java.util.*;

public class Ternary {
    public static int ternarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // split array into 3 parts
            int mid1 = left + (right - left) / 3;
            int mid2 = right - (right - left) / 3;

            if (arr[mid1] == target) return mid1;
            if (arr[mid2] == target) return mid2;

            // check which part to move into
            if (target < arr[mid1]) {
                right = mid1 - 1;
            } else if (target > arr[mid2]) {
                left = mid2 + 1;
            } else {
                left = mid1 + 1;
                right = mid2 - 1;
            }
        }

        // not found
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 57, 12, 97, 36, 45, 2, 27, 79};
        Arrays.sort(nums);
        System.out.println("Searching in: " + Arrays.toString(nums));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find: ");
        int x = sc.nextInt();

        int res = ternarySearch(nums, x);
        if (res != -1)
            System.out.println("Found at index " + res);
        else
            System.out.println("Not found :(");
    }
}
