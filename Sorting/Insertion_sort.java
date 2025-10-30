import java.util.*;

public class Insertion_sort {

 public static int[] insertion_sort(int[] lst) {
  // insertion sort, picks one element and puts it in right place
  for (int i = 1; i < lst.length; i++) {
   int key = lst[i];
   int j = i - 1;
   
   // move stuff bigger than key one step ahead
   while (j >= 0 && lst[j] > key) {
    lst[j + 1] = lst[j];
    j--;
   }

   lst[j + 1] = key;

   // one pass done, moves on
  }

  return lst;
 }

 public static void main(String[] args) {
  int[] nums = {9,3,57,12,97,36,45,2,27,79};
  System.out.println("Before: " + Arrays.toString(nums));
  System.out.println("sorting...");

  int[] sorted_nums = insertion_sort(nums);

  System.out.println("After : " + Arrays.toString(sorted_nums));
 }
}
