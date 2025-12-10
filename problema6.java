import java.util.Scanner;

public class problema6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Aquest es el problema 6");
        System.out.println("Introdueix una seqüència de paréntesis: ");
        String seq = sc.next();
        int balance = 0;
        
        for (int i = 0; i < seq.length(); i++) {
            char c = seq.charAt(i);

            if (c == '(') {
                balance++;
            } else if (c == ')') {
                balance--;
            }

            if (balance < 0) {
                break;
            }
        }

        if (balance == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}