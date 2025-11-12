public class JV05Correction {
    public static void main(String[] args) {
        int totalComandes = 5; // Comandes ja existents abans del torn

        System.out.println("Abans de començar el torn, totalComandes = " + totalComandes);

        // Simulem que tres cambrers afegeixen noves comandes
        int numCambrers = 3;
        totalComandes += afegirComandes(numCambrers);

        System.out.println("Després del torn, totalComandes = " + totalComandes);
    }
    public static int afegirComandes(int cambrers) {
        int totalComandes = 0;
        for (int i = 0; i < cambrers; i++) {
            totalComandes += 1;    // incrementa només la variable interna
            System.out.println("Cambrer " + (i + 1) + " ha afegit una comanda. totalComandes dins del bucle = " + totalComandes);
        }
        return totalComandes;
    }
}
