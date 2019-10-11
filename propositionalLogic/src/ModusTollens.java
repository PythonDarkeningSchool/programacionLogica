import java.util.Scanner;

public class ModusTollens {
    public static void main(String[] args) {
        // INFERENCE RULE
        // The mode of negation by negation
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(" === Modus Tollens ===");
            System.out.println("Premisa: Si el rey esta en jaque mate por lo tanto tu pierdes el juego\n");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Tu perdiste el juego");
            System.out.println("2. Tu no has perdido el juego\n");

            int option = scan.nextInt();
            String message;
            boolean flag = false;

            if (option == 1) { message = "El rey esta en jaque mate"; flag = true; }
            else if (option == 2) { message = "El rey no esta en jaque mate"; flag = true; }
            else { message = "Opcion invalida"; }

            System.out.println(String.format("%s", message));
            if(flag){ break; }
        }
    }
}
