import java.util.Scanner;

public class EvalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ehPos = "O número %s é positivo";
        String ehNeg = "O número %s é negativo";
        String ehZero = "O número é zero e par;";
        String ehPar = " e par;";
        String ehImpar = " e ímpar;";

        System.out.printf("Informe um número: \n");
        Integer numero = Integer.parseInt(sc.nextLine());

        if(numero.equals(0)) {
            System.out.printf(ehZero);
        } else {
            System.out.printf(numero > 0      ? ehPos : ehNeg, numero);
            System.out.printf(numero % 2 == 0 ? ehPar : ehImpar);
        }
    }
}
