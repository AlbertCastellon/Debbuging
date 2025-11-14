import java.util.Scanner;

public class JV07 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { //Per emportar!
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.println("Hello, " + name);
        }
    }
}
