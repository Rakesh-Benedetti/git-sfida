import java.util.Random;
import java.util.Scanner;

public class GestioneDado {
    private static final Random random = new Random();

    public int LancioD6() {
        return random.nextInt(6) + 1;
    }

    public int LancioD6X2 () {
        return random.nextInt((6) + 1) + (random.nextInt(6) + 1);
    }

    public int LancioD20() {
        return random.nextInt(20) + 1;
    }

    public int LancioNDadiSFacce() {
        Scanner scanner = new Scanner(System.in);
        int n, s;
        do {
            System.out.println("Inserisci numero di dadi da lanciare " + "\n");
            n = scanner.nextInt();
        }while (n > 0);
        do {
            System.out.println("Inserisci numero di facce del dado " + "\n");
            s = scanner.nextInt();
        }while (s > 0);
        int somma = 0;
        for (int i = 0; i < n; i++){
            somma = (random.nextInt(s) + 1) + somma;
        }
        return somma;
    }
}
