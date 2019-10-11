import java.util.Scanner;

public class DisjunctiveSyllogism {
    public static void main(String[] args) {
        // INFERENCE RULE
        // Or is one option or is the other but never both at the same time
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(" === Silogismo Disyuntivo ===");
            System.out.println("Premisa: O el Leon esta durmiendo O el Leon esta cazando\n");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. El Leon No esta durmiendo");
            System.out.println("2. El Leon No esta cazando\n");

            int option = scan.nextInt();
            String message;
            boolean flag = false;

            if (option == 1) { message = "Por lo tanto, el Leon esta cazando"; flag = true; }
            else if (option == 2) { message = "Por lo tanto, el Leon esta durmiendo"; flag = true; }
            else { message = "Opcion invalida"; }

            System.out.println(String.format("%s", message));
            if(flag){ break; }
        }
    }
}
