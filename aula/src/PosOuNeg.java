import java.util.Scanner;

public class PosOuNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ehPos = "O número %s é positivo;";
        String ehNeg = "O número %s é negativo;";
        String ehZero = "O número é zero;";

        System.out.printf("Informe um número: \n");
        Double numero = Double.parseDouble(sc.nextLine());
        if(numero.equals(0.0)) {
            System.out.printf(ehZero);
        } else {
            if(numero > 0){
                System.out.printf(ehPos, numero);
            } else {
                System.out.printf(ehNeg, numero);
            }
        }
    }
}
