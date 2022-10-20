import java.util.Scanner;

public class QuestaoSeis {
    /*
    * Realizar uma operação matemática, que deve ser passada via
    * input do usuário ( opções: + - / * ) entre dois números inteiros
    * que também devem ser solicitados via System.in. Caso a operação
    * seja desconhecida exibir uma mensagem "Operação desconhecida" e
    * encerrar o programa.
    *
    * */
    public static void main(String[] args) {
        int val1, val2;
        double result = 0.0;
        Character op;
        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual operação deseja fazer? ( opções: + - / * )\n");
        op = Character.valueOf(sc.nextLine().charAt(0));

        if(op != '+' || op != '-' || op != '/' || op != '*'){
            System.out.println("Operação desconhecida");
            return;
        }

        System.out.printf("Informe o primeiro número.\n");
        val1 = Integer.parseInt(sc.nextLine());

        System.out.printf("Informe o segundo número.\n");
        val2 = Integer.parseInt(sc.nextLine());

        switch(op){
            case '+':
                result = val1 + val2;
                break;
            case '-':
                result = val1 - val2;
                break;
            case '*':
                result = val1 * val2;
                break;
            case '/':
                result = val1 / val2;
                break;
        }

        System.out.printf("%d %c %d = %.2f\n", val1, op, val2, result);
    }
}
