import java.util.Scanner;

public class QuestaoUm {
    /*
        Crie um programa que pergunte qual a altura em metros e peso
        em Kg desta pessoa e retorne o IMC e a classificação deste IMC.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua altura em metros?");
        float height = Float.parseFloat(sc.nextLine());
        System.out.println("Informe seu peso em Kg?");
        float weight = Float.parseFloat(sc.nextLine());

        float imc_value = weight/(height * height);

        System.out.printf("O valor do seu IMC é %.2f (considerado %s)", imc_value, classifyImc(imc_value));
    }

    public static String classifyImc(float imc){
        String output;
        if(imc < 17.00){
            output = "Muito abaixo do peso";
        } else if(imc >= 17.00 && imc < 18.50){
            output = "Abaixo do peso";
        } else if(imc >= 18.50 && imc < 25.00){
            output = "Peso normal";
        } else if(imc >= 25.00 && imc < 30.00){
            output = "Acima do peso";
        } else if(imc >= 30.00 && imc < 35.00){
            output = "Obesidade I";
        } else if(imc >= 35.00 && imc < 40.00){
            output = "Obesidade II (severa)";
        } else {
            output = "Obesidade III (mórbida)";
        }
        return output;
    }
}
