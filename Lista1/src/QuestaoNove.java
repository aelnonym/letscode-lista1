import java.util.Scanner;

public class QuestaoNove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int min = 101;
        int max = -1;
        int nota = -1;
        System.out.printf("Informe a quantidade de provas:\n");
        int qtdProva = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < qtdProva; i++){
            nota = askForNumber(sc, i);
            min = nota < min ? nota : min;
            max = nota > max ? nota : max;
            sum += nota;
        }

        System.out.printf("A menor nota é: %d\n", min);
        System.out.printf("A maior nota é: %d\n", max);
        System.out.printf("A média das notas é: %d\n", sum/qtdProva);

    }

    public static int askForNumber(Scanner sc, int prova) {
        System.out.printf("Informe a nota da prova %d:\n", prova+1);
        return Integer.parseInt(sc.nextLine());
    }
}
