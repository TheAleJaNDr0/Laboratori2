import java.util.Scanner;

public class problema5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest es el problema 5");
        System.out.println("Introdueix una paraula: ");
        String p = sc.next();
        int longitudMax = 0;
        int longitudActual = 0;
        System.out.println("Introdueix una seqüència de paraules: ");
        while (sc.hasNext()) {
            String paraula = sc.next();

            if (paraula.equals(".")) {
                break;
            }

            if (paraula.equals(p)) {
                longitudActual++;
                if (longitudActual > longitudMax) {
                    longitudMax = longitudActual;
                }
            } else {
                longitudActual = 0;
            }
        }

        System.out.println(longitudMax);
        sc.close();
    }
}