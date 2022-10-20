import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Bhaskara {

    public static void main(String[] args) {
        BigDecimal a, b, c;
        Scanner sc = new Scanner(System.in);
        MathContext mc = new MathContext(3);
        a = askForVariable("a", sc, mc);
        b = askForVariable("b", sc, mc);
        c = askForVariable("c", sc, mc);

        evaluateBhaskra(a, b, c, mc);
    }

    public static BigDecimal askForVariable(String name, Scanner sc, MathContext mc) {
        System.out.printf("Informe o coeficiente %s: \n", name);
        return new BigDecimal(sc.nextDouble(), mc);
    }

    public static void evaluateBhaskra(BigDecimal a, BigDecimal b, BigDecimal c, MathContext mc) {


        BigDecimal delta = b.pow(2).subtract(a.multiply(c).multiply(new BigDecimal(4)));

        BigDecimal sqrt = delta.sqrt(mc);
        BigDecimal minusB = b.multiply(new BigDecimal(-1));

//        BigDecimal x1 = (-b + sqrt) / (2 * a);
        BigDecimal x1 = minusB.add(sqrt).divide(new BigDecimal(2).multiply(a));
        BigDecimal x2 = minusB.subtract(sqrt).divide(new BigDecimal(2).multiply(a));
        int comparison = delta.compareTo(BigDecimal.ZERO);

        System.out.printf("O valor do delta é: %s\n", delta);
        if (comparison == 0) {
            System.out.println(x1 + "" + x2);
            System.out.printf("Só existe uma raiz X que é %s\n", x1);
        } else if(comparison > 0) {
            System.out.printf("A raiz x1 é: %.3f\n", x1);
            System.out.printf("A raiz x2 é: %.3f\n", x2);
        } else {
            System.out.printf("Não existe raiz real");
        }

    }

}
