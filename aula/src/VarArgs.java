import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        int init, end;
        if(args.length == 0){
            Scanner sc = new Scanner(System.in);
            System.out.printf("Informe o valor inicial:\n");
            init = Integer.parseInt(sc.nextLine());
            System.out.printf("Informe o valor final:\n");
            end = Integer.parseInt(sc.nextLine());
        } else if (args.length == 1) {
            init = Integer.parseInt(args[0]);
            Scanner sc = new Scanner(System.in);
            System.out.printf("Informe o valor final:\n");
            end = Integer.parseInt(sc.nextLine());
        } else if (args.length == 2){
            init = Integer.parseInt(args[0]);
            end = Integer.parseInt(args[1]);
        } else {
            System.out.printf("Numero de argumentos X é invalido, esperado até 2 argumentos.");
            return;
        }

        System.out.printf("Resultado: [");
        while(init < end){
            System.out.printf("%d, ", init);
            init++;
        }
        System.out.printf("%d]", end);

    }
}
