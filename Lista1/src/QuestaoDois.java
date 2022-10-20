import java.util.Scanner;

public class QuestaoDois {

    /*
    * Faça um programa que receba as quatro notas de 0 a 10 de um aluno e
    * informe a média das notas. Caso receba notas maiores que 10 ou menores
    * que zero é para retornar uma mensagem informando que valor é inválido
    * e encerrar o programa.
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float grades[] = new float[4];
        for(int exam = 1; exam < 5; exam++){
            System.out.printf("Informe a nota da prova %d:\n", exam);
            grades[exam-1] = Float.parseFloat(sc.nextLine());
            if(grades[exam-1] < 0 || grades[exam-1] > 10){
                System.out.println("Valor Inválido");
                return;
            }
        }

        float mean = 0;
        for (int i = 0; i < grades.length; i++){
            mean += grades[i];
        }
        System.out.printf("A média do aluno foi %.1f\n", mean/grades.length);
    }

}
