import java.util.Scanner;

public class Operations {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        int numberA = scan.nextInt();
        System.out.print("Dame el segundo numero: ");
        int numberB = scan.nextInt();

        while(true){
            System.out.print("\n\nQue operacion deseas realizar:\n");
            System.out.print("1. Suma\n");
            System.out.print("2. Resta\n");
            System.out.print("3. Multiplicacion\n");
            System.out.print("4. Division\n");
            System.out.print("5. Salir\n");

            float option = scan.nextFloat();

            if (option == 1) { OpSuma(numberA, numberB); }
            else if (option ==2) { OpResta(numberA, numberB); }
            else if (option ==3) { OpMultiplicacion(numberA, numberB); }
            else if (option ==4) { OpDivision(numberA, numberB); }
            else if (option ==5) { break; }
        }
    }

    private static void OpSuma(float numberA, float numberB){
        System.out.println(String.format("\nEl resultado de la suma es: %s\n", numberA + numberB));
    }

    private static void OpResta(float numberA, float numberB){
        System.out.println(String.format("\nEl resultado de la resta es: %s\n", numberA - numberB));
    }

    private static void OpMultiplicacion(float numberA, float numberB){
        System.out.println(String.format("\nEl resultado de la multiplicacion es: %s\n", numberA * numberB));
    }

    private static void OpDivision(float numberA, float numberB){
        float division = numberA / numberB;
        System.out.println(String.format("\nEl resultado de la division es: %s\n", division));
    }
}
