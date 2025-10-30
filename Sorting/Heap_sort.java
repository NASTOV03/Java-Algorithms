import java.util.*;

public class Heap_sort {
 
 public static void heapify(int[] lst, int n, int i) {
  // makes sure the tree with root i is a heap
  int largest = i;
  int left = 2 * i + 1;
  int right = 2 * i + 2;

  if (left < n && lst[left] > lst[largest])
   largest = left;
  if (right < n && lst[right] > lst[largest])
   largest = right;

  if (largest != i) {
   int temp = lst[i];
   lst[i] = lst[largest];
   lst[largest] = temp;

   heapify(lst, n, largest);
  }
 }

 public static int[] heap_sort(int[] lst) {
  // heap sort, turns list into heap then sorts it
  int n = lst.length;

  // build max heap
  for (int i = n / 2 - 1; i >= 0; i--) {
   heapify(lst, n, i);
  }

  // pull elements one by one
  for (int i = n - 1; i > 0; i--) {
   int temp = lst[0];
   lst[0] = lst[i];
   lst[i] = temp;

   heapify(lst, i, 0);
  }

  return lst;
 }

 public static void main(String[] args) {
  int[] nums = {9,3,57,12,97,36,45,2,27,79};
  System.out.println("Before: " + Arrays.toString(nums));
  System.out.println("sorting...");

  int[] sorted_nums = heap_sort(nums);

  System.out.println("After : " + Arrays.toString(sorted_nums));
 }
}
