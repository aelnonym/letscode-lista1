import java.math.BigDecimal;
import java.util.Scanner;

public class Bisexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = Integer.parseInt(sc.nextLine());
        if(ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
            System.out.printf("É Bissexto \n");
        } else {
            System.out.printf("Não é Bissexto \n");
        }
    }
}
