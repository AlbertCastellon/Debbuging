public class JV01 {
    public static void main(String[] args) {
        //Off-by-One
        int sumaErronia = 0;
        for (int i = 1; i <= 5; i++){
            sumaErronia += i * 2;
        }

        System.out.println("Resultat erroni: " + sumaErronia);}}