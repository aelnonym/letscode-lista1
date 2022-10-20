import java.util.Random;

public class QuestaoTres {

    public static void main(String[] args) {
        double temp[] = new double[10];
        for(int i = 0; i < temp.length; i++){
            temp[i] = new Random().nextDouble(0, 300);
            System.out.printf("Temperatura %d %.2fºC são %.2fºF\n", i+1, temp[i], celciusToFahrenheit(temp[i]));
        }
    }

    public static double celciusToFahrenheit(double celcius_val){
        double fator1 = 9.0/5.0;
        double fator2 = 32.0;
        double fahrenheit = (celcius_val * fator1) + fator2;
        return fahrenheit;
    }
}
