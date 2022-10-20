import java.util.Scanner;

public class Paridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ehPar = "O número %s é par;";
        String ehImpar = "O número %s é impar;";

        System.out.printf("Informe um número: \n");
        long numero = Long.parseLong(sc.nextLine());
        System.out.printf(numero % 2 == 0 ? ehPar : ehImpar, numero);
    }
}
