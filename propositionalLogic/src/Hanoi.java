import java.util.Scanner;
import java.lang.Math;

public class Hanoi {

    // Java recursive function to solve tower of hanoi puzzle
    private static void towerOfHanoi(int n, int origin, int aux, int dest) {


        if (n == 1) { System.out.println(String.format("Mover disco de (%s) a -> (%s)", origin, dest)); }
        else {
            towerOfHanoi(n-1, origin, dest, aux);
            System.out.println(String.format("Mover disco de (%s) a -> (%s)", origin, dest));
            towerOfHanoi(n-1, aux, origin, dest);
        }
    }

    //  Driver method
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numero de discos: ");
        int n = scan.nextInt();

        double moves = Math.pow(2, n) - 1;

        System.out.println(String.format("Numero de movimientos a realizar: [%s]", moves));
        towerOfHanoi(n, 1, 2, 3);
    }
}
