import java.util.Scanner;

public class ConstructiveDilemma {
    public static void main(String[] args) {
        // INFERENCE RULE
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println(" === Dilema Constructivo ===");
            System.out.println("Premisa: Si es temporada de lluvias me compro un paraguas y si es temporada de calor me ire a la playa\n");
            System.out.println("Selecciona una opcion:");
            System.out.println("1. Es temporada de lluvias");
            System.out.println("2. Es temporada de calor\n");

            int option = scan.nextInt();
            String message;
            boolean flag = false;

            if (option == 1) { message = "Por lo tanto, me compro un paraguas"; flag = true; }
            else if (option == 2) { message = "Por lo tanto me ire a la playa"; flag = true; }
            else { message = "Opcion invalida"; }

            System.out.println(String.format("%s", message));
            if(flag){ break; }
        }
    }
}
