import java.util.*;

public class Binary_search {
 public static Integer binary_search(List<Integer> lst, int target) {
  // binery search, cuts the list in half each time
  int low = 0;
  int high = lst.size() - 1;

  while (low <= high) {
   int mid = (low + high) / 2;
   
   if (lst.get(mid) == target) {
    return mid;
   } else if (lst.get(mid) < target) {
     low = mid + 1;
   } else {
    high = mid - 1;
   }
  }

  // not found
  return null;
 }


 public static void main(String[] args) {
  List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,9,12,27,36,45,57,79,97));
  System.out.println("Searching in:" + nums);

  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter number to find: ");
   int x = sc.nextInt();
   Integer res = binary_search(nums, x);

   if (res != null) {
    System.out.println("Found at index " + res);
   } else {
    System.out.println("Nope, not found :(");
   }
  } finally {
   sc.close();
  }
 }
}
