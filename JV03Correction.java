import java.util.Scanner;

public class JV03Correction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();

        // CORRECT COMPARISON
        if (pass.equals("admin")) {
            System.out.println("Access granted!");
        } else {
            System.out.println("Access denied!");
        }
    }
}