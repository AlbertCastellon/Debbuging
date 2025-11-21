public class JV07 {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        // Resultat amb enters: es perd la part decimal
        int resultatEnter = a / b;
        System.out.println("Resultat de 5 / 2 amb enters: " + resultatEnter);

        // Explicació
        System.out.println("Amb enters, la divisió trunca la part decimal (5 / 2 = 2).");

        // Correcció amb casting
        double resultatDouble = (double) a / b;
        System.out.println("Resultat de (double)5 / 2: " + resultatDouble);

        // Print debugging final
        System.out.println("Abans: 5/2 = " + resultatEnter);
        System.out.println("Després: (double)5/2 = " + resultatDouble);
    }
}
