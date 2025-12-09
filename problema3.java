import java.util.Scanner;

public class problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest es el problema 3");
        System.out.println("Introdueix la paraula p: ");
        String p = s.next();
        boolean trobada = false;
        System.out.println("Introdueix una paraula: ");
        while (sc.hasNext()) {
            String paraula = sc.next();
            
            if (paraula.equals(".")) {
                break;
            }
            
            if (paraula.equals(p)) {
                trobada = true;
                break;
            }
        
            if (paraula.compareTo(p) > 0) {
                break;
            }
        }

        if (trobada == true) {
            System.out.println("SI");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}