import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class QuestaoSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe o valor inicial investido em R$.\n");
        BigDecimal valor = sc.nextBigDecimal();
        System.out.print("Informe o juros ao mês em %\n");
        BigDecimal juros = sc.nextBigDecimal();
        System.out.printf("Informe o tempo em meses que o dinheiro ficará investido.\n");
        int meses = sc.nextInt();

        System.out.printf("%.1f reais, %.2f%% de juros ao mês por %d meses.\n", valor, juros, meses);

        for(int i = 0; i < meses; i++){
            BigDecimal parcela = valor.multiply(juros.divide(new BigDecimal("100")));
            valor = valor.add(parcela);
            System.out.printf("Mês %d: Juros: R$ %.2f , saldo: %.2f\n", i+1, parcela, valor);
        }

    }
}
