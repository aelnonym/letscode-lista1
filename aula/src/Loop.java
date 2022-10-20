import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Informe o valor inicial:\n");
        int init = Integer.parseInt(sc.nextLine());
        System.out.printf("Informe o valor final:\n");
        int end = Integer.parseInt(sc.nextLine());
        System.out.printf("Resultado: [");
        while(init < end){
            System.out.printf("%d, ", init);
            init++;
        }
        System.out.printf("%d]", end);
    }
}
