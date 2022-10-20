import java.util.Scanner;

public class QuestaoOito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um inteiro positivo: ");
        int n = Integer.parseInt(sc.nextLine());
        long sum = n;
        while (n-- != 0){
            sum+=n;
        }
        System.out.println(sum);
    }
}
