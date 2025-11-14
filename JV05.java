public class JV05 {
    static int totalComandes = 5; // Comandes ja existents abans del torn
    public static void main(String[] args) {
         

        System.out.println("Abans de començar el torn, totalComandes = " + totalComandes);

        // Simulem que tres cambrers afegeixen noves comandes
        int numCambrers = 3;
        afegirComandes(numCambrers);

        System.out.println("Després del torn, totalComandes = " + totalComandes);
    }
    public static void afegirComandes(int cambrers) {   
        int totalComandes = 0;
        for (int i = 0; i < cambrers; i++) {
            totalComandes += 1;    // incrementa només la variable interna
            System.out.println("Cambrer " + (i + 1) + " ha afegit una comanda. totalComandes dins del bucle = " + totalComandes);
        }
    }
}
