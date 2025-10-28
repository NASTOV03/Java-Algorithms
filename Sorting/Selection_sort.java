import java.util.*;

public class Selection_sort {
 public static List<Integer> selection_sort(List<Integer> lst) {
  // selection sort, finds the smallest each time and puts it front
  for (int i = 0; i < lst.size(); i++) {
   int min_index = i;
   
   for (int j = i + 1; j < lst.size(); j++) {
    if (lst.get(j) < lst.get(min_index)) {
     min_index = j;
    }
   }

   // swap the found one with current
   int temp = lst.get(i);
   lst.set(i, lst.get(min_index));
   lst.set(min_index, temp);
  
   // one pass done, moves on
  }
  return lst;
 }


 public static void main(String[] args) {
  List<Integer> nums = new ArrayList<>(Arrays.asList(9,3,57,12,97,36,45,2,27,79));
  System.out.println("Before:" + nums);
  System.out.println("sorting...");

  List<Integer> sorted_nums = selection_sort(nums);

  System.out.println("After :" + sorted_nums);
 }
}
