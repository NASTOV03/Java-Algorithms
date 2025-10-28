import java.util.*;

public class Linear_search {
 public static Integer linear_search(List<Integer> lst, int target) {
  // linear search, just checks one by one til found
  for (int i = 0; i < lst.size(); i++) {
   if (lst.get(i) == target) {
    return i;
   }
   
   // keeps going if not found yet
  }
  
  // if we reach here, it isnt  there
  return null;
 }


 public static void main(String[] args) {
  List<Integer> nums = new ArrayList<>(Arrays.asList(9,3,57,12,97,36,45,2,27,79));
  System.out.println("Searching in:" + nums);

  Scanner sc = new Scanner(System.in);
  try {
   System.out.print("Enter number to find: ");
   int x = sc.nextInt();
   Integer res = linear_search(nums, x);

   if (res != null) {
    System.out.println("Found at index " + res);
   } else {
    System.out.println("Not found :(");
   }
  } finally {
   sc.close();
  }
 }
}
