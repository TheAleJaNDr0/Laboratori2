import java.util.Scanner;

public class problema2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest es el problema 2");
        System.out.println("Introdueix un numero x: ");
        if (!sc.hasNextInt()) {
            return;
        }
        int x = sc.nextInt();
        System.out.println("Introdueix un numero y: ");
        if (!sc.hasNextInt()) {
            return;
        }
        int y = sc.nextInt();
        boolean trobat = false;

        while (y > 0) {
            int digit = y % 10;
            if (digit == x) {
                trobat = true;
                break;
            }
            y = y / 10;
        }
        if (trobat == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
