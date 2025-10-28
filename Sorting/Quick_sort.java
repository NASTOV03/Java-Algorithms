import java.util.*;

public class Quick_sort{
    public static List<Integer> quick_sort(List<Integer> lst) {
     // quick sort, picks a pivot and devides stuff around it
     if (lst.size() <= 1) {
      return lst;
     }

     int pivot = lst.get(lst.size()/2);
     List<Integer> left = new ArrayList<>();
     List<Integer> mid = new ArrayList<>();
     List<Integer> right = new ArrayList<>();

     for (int x : lst) {
      if (x < pivot) left.add(x);
      else if (x == pivot) mid.add(x);
      else right.add(x);
     }

     // recurively sort left and right side
     List<Integer> result = new ArrayList<>();
     result.addAll(quick_sort(left));
     result.addAll(mid);
     result.addAll(quick_sort(right));
     return result;
    }


    public static void main(String[] args) {
     List<Integer> nums = Arrays.asList(9,3,57,12,97,36,45,2,27,79);
     System.out.println("Before:" + nums);
     System.out.println("sorting...");

     List<Integer> sorted_nums = quick_sort(nums);

     System.out.println("After :" + sorted_nums);
    }
}
