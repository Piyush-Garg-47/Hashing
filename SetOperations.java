import java.util.*;

public class SetOperations {
  public static void main(String[] args) {
    int arr1[] = { 7, 3, 9 };
    int arr2[] = { 6, 3, 9, 2, 9, 4 };

    // Union
    HashSet<Integer> unionSet = new HashSet<>();
    for (int num : arr1) {
      unionSet.add(num);
    }
    for (int num : arr2) {
      unionSet.add(num);
    }
    System.out.println("Union of arr1 and arr2 = " + unionSet.size());

    // Intersection
    HashSet<Integer> set1 = new HashSet<>();
    for (int num : arr1) {
      set1.add(num);
    }

    int intersectionCount = 0;
    for (int num : arr2) {
      if (set1.contains(num)) {
        intersectionCount++;
        set1.remove(num);
      }
    }
    System.out.println("Intersection count = " + intersectionCount);
  }
}
