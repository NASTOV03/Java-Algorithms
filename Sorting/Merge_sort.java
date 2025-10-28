import java.util.*;

public class Merge_sort {
 public static List<Integer> merge_sort(List<Integer> lst) {
  // merge sort, devides the list and then combines in sorted way
  if (lst.size() <= 1) {
   return lst;
  }

  int mid = lst.size() / 2;
  List<Integer> left_half = merge_sort(lst.subList(0, mid));
  List<Integer> right_half = merge_sort(lst.subList(mid, lst.size()));
  
  return mergeThem(new ArrayList<>(left_half), new ArrayList<>(right_half));
 }


 public static List<Integer> mergeThem(List<Integer> a, List<Integer> b) {
  List<Integer> result = new ArrayList<>();
  int i = 0, j = 0;

  // merging part
  while (i < a.size() && j < b.size()) {
   if (a.get(i) < b.get(j)) {
    result.add(a.get(i));
    i += 1;
   } else {
    result.add(b.get(j));
    j += 1;
   }
  }

  // add what’s left from a
  while (i < a.size()) {
   result.add(a.get(i));
   i += 1;
  }

   // add what’s left from b (if any)
  while (j < b.size()) {
    result.add(b.get(j));
    j += 1;
  }

  return result;
 }


 public static void main(String[] args) {
  List<Integer> nums = new ArrayList<>(Arrays.asList(9,3,57,12,97,36,45,2,27,79));
  System.out.println("Before:" + nums);
  System.out.println("sorting...");

  List<Integer> sorted_nums = merge_sort(nums);

  System.out.println("After :" + sorted_nums);
 }
}
