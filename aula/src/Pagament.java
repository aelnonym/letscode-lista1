import java.text.Normalizer;
import java.util.Scanner;

public class Pagament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] payment_type = {"CREDITO", "DEBITO", "CHEQUE", "BOLETO", "DINHEIRO", "PIX"};
        double[] type_discount = {3, 3, 6, 9, 12, 12};
        System.out.printf("Qual o valor da compra?\n");
        double value = Double.parseDouble(sc.nextLine());
        System.out.printf("Qual a forma de pagamento? [CREDITO, DEBITO, CHEQUE, BOLETO, DINHEIRO, PIX]\n");
        String payment_type_selected = sc.nextLine().toUpperCase();
        payment_type_selected = Normalizer.normalize(payment_type_selected, Normalizer.Form.NFKC);
        int discount;
        switch(payment_type_selected){
            case "CREDITO":
            case "DEBITO":
                discount = 3;
                break;
            case "CHEQUE":
                discount = 6;
                break;
            case "BOLETO":
                discount = 9;
                break;
            default:
                discount = 12;
        }
        System.out.printf("Sua compra possui %d%% de desconto.\n", discount);
        System.out.printf("Totalizando R$ %.2f\n", (value - (value*discount)/100));
    }
}
