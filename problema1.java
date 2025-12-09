import java.util.Scanner;

public class problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest es el problema 1");
        System.out.println("Introdueix una seqüència de nombres: ");
        boolean trobat = false;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            if (x % 2 == 0) {
                trobat = true;
            }
        }
        if (trobat == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}