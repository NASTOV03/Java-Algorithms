import java.util.*;

public class Bubble_sort {
 public static List<Integer> bubble_sort(List<Integer> lst) {
  // bubble sort, keeps swapping untill list is sorted
  int n = lst.size();
  
  for (int i = 0; i < n - 1; i++) {
   for (int j = 0; j < n - i - 1; j++) {
    if (lst.get(j) > lst.get(j + 1)) {
     // swap em
     int temp = lst.get(j);
     lst.set(j, lst.get(j + 1));
     lst.set(j + 1, temp);
    }
   
   // pass done
   // decrases range each time
  }
}
  return lst; }


 public static void main(String[] args) {
  List<Integer> nums = new ArrayList<>(Arrays.asList(9,3,57,12,97,36,45,2,27,79));
  System.out.println("Before:" + nums);
  System.out.println("sorting...");

  List<Integer> sorted_nums = bubble_sort(nums);

  System.out.println("After :" + sorted_nums);
 }
}
