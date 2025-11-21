import java.util.*;

public class JV08 {
    public static void main(String[] args) {
        // Create two large lists
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> list2 = Arrays.asList(5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        
        System.out.println("Finding common elements (Nested Loop - O(n²)):");
        
        long startTime = System.nanoTime();
        
        // Problem: Nested loops - O(n²) time complexity
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    System.out.println("Found common element: " + list1.get(i));
                    // No break - continues checking even after finding match
                }
            }
        }
        
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time taken: " + duration + " nanoseconds");
    }
}
