import java.util.Scanner;

public class QuestaoCinco {

    /*
    * Criar um programa que recebe 2 números e realiza a soma deles. Porém,
    * nesse caso o programa deve verificar quantos parâmetros são enviados
    * como argumento do método main(args).
    * Se for nenhum, deve pedir via System.in que o usuário digite 2 números.
    * No caso de vir apenas 1, deve pedir outro parâmetro via System.in.
    * Se for 2, deve realizar a soma dos dois.
    * No caso de qualquer outra quantidade. Deve apresentar uma mensagem
    * de erro falando que a quantidade é inválida.
    *
    * */
    public static void main(String[] args) {
        double val1, val2;
        if(args.length == 0){
            Scanner sc = new Scanner(System.in);
            System.out.printf("Informe o primeiro valor:\n");
            val1 = Double.parseDouble(sc.nextLine());
            System.out.printf("Informe o segundo valor:\n");
            val2 = Double.parseDouble(sc.nextLine());
        } else if (args.length == 1) {
            val1 = Double.parseDouble(args[0]);
            Scanner sc = new Scanner(System.in);
            System.out.printf("Informe o segundo valor:\n");
            val2 = Double.parseDouble(sc.nextLine());
        } else if (args.length == 2){
            val1 = Double.parseDouble(args[0]);
            val2 = Double.parseDouble(args[1]);
        } else {
            System.out.printf("Numero de argumentos X é invalido, esperado até 2 argumentos.");
            return;
        }

        System.out.printf("A soma de %.2f e %.2f é: %¨.2f, ", val1, val2, val1+val2);
    }
}
