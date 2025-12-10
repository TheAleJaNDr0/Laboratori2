import java.util.Scanner;

public class problema4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest es el problema 4");
        System.out.println("Introdueix un nombre enter p: ");
        int p = sc.nextInt();
        boolean inserit = false;
        

        while (sc.hasNextInt()) {
            System.out.println("Introdueix una seqüència de numeros ascendents: ");
            String s = sc.next();
            if (s.equals(".")) break;
            int numero = Integer.parseInt(s);

            if (!inserit && p <= numero) {
                System.out.println(p + " ");
                inserit = true;
            }

            System.out.println(numero + " ");
        }

        if (!inserit) {
            System.out.println(p + " ");
        }
        System.out.println("\n");
        sc.close();
    }
}