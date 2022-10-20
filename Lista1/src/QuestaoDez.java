import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class QuestaoDez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe o valor do emprestimo em R$.\n");
        BigDecimal saldoDevedor = sc.nextBigDecimal();
        BigDecimal totEmprestimo = saldoDevedor;
        System.out.print("Informe a taxa de juros do emprestimo em %\n");
        BigDecimal juros = sc.nextBigDecimal().divide(new BigDecimal("100"));
        System.out.printf("Informe o tempo para pagamento.\n");
        int meses = sc.nextInt();
        BigDecimal parcela = calcParcela(totEmprestimo, meses, juros);
        System.out.printf("Valor fixo da parcela R$ %.2f, Saldo devedor total R$ %.2f\n", parcela, saldoDevedor);
        BigDecimal totJuros = BigDecimal.ZERO;

        for(int i = 0; i < meses; i++){
            BigDecimal jurosAtual = saldoDevedor.multiply(juros);
            totJuros = totJuros.add(jurosAtual);
            BigDecimal amortizacao = parcela.subtract(jurosAtual);
            saldoDevedor = saldoDevedor.subtract(amortizacao);
            if(saldoDevedor.compareTo(new BigDecimal("0.00")) == -1){
                saldoDevedor = BigDecimal.ZERO;
            }
            
            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$: %.2f | Saldo devedor: R$ %.2f\n", i+1, jurosAtual, amortizacao, saldoDevedor);
        }
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", totJuros.add(totEmprestimo), totJuros, totEmprestimo);
    }

    public static BigDecimal calcParcela(BigDecimal PV, int n, BigDecimal i){
        MathContext mc = new MathContext(20);
        BigDecimal iMaisUmElevadoN = i.add(BigDecimal.ONE).pow(n);
        BigDecimal fator = iMaisUmElevadoN.multiply(i).divide(iMaisUmElevadoN.subtract(BigDecimal.ONE), mc);
        return PV.multiply(fator);
    }
}
