import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathContext mc = new MathContext(3);
        BigInteger base = askForVariable(sc);
        System.out.printf("%s! = %s \n", base, fatorialRec(base));
    }

    public static BigInteger fatorialRec(BigInteger n){
        if(n.compareTo(BigInteger.ZERO) <= 0){
            return BigInteger.ONE;
        }
        return fatorialRec(n.subtract(BigInteger.ONE)).multiply(n);
    }

    public static BigInteger askForVariable(Scanner sc) {
        System.out.printf("Informe um número: \n");
        return sc.nextBigInteger();
    }
}
