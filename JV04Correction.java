public class JV04Correction {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        // CORRECT LOOP - Stays within bounds
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}