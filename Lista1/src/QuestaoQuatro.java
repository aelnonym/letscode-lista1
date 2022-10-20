import java.util.Scanner;

public class QuestaoQuatro {
    public static void main(String[] args) {
        int number;
        if(args.length == 1){
            number = Integer.parseInt(args[0]);
            System.out.printf("O numero %d é %s\n", number, number % 2 == 0 ? "Par":"Impar");
        } else {
            System.out.println("Número inválido de argumentos, é esperado que seja informado um argumento");
        }
    }
}
