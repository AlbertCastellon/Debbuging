public class JV04 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        // INCORRECT LOOP - Index out of bounds
        for (int i = 0; i <= numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}