import java.util.Scanner;


public class ModusPonens {
    public static void main(String[] args) {
        // INFERENCE RULE2

        // The mode of affirmation by affirmation
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(" === Modus Ponens ===");
            System.out.println("Premisa: Si el rey esta en jaque mate por lo tanto tu pierdes el juego\n");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. El rey esta en jaque mate");
            System.out.println("2. El rey NO esta en jaque mate\n");

            int option = scan.nextInt();
            String message;
            boolean flag = false;

            if (option == 1) { message = "Has perdido la partida"; flag = true; }
            else if (option == 2) { message = "No has perdido la partida"; flag = true; }
            else { message = "Opcion invalida"; }

            System.out.println(String.format("%s", message));
            if(flag){ break; }
        }
    }
}
