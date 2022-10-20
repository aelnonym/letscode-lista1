import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberToBeFound = new Random().nextInt(0, 101);
        int guesses = 0;
        int min = 101;
        int max = -1;
        int guess = -1;

        while(guess != numberToBeFound){
            guess = askForNumber(sc);
            min = guess < min ? guess : min;
            max = guess > max ? guess : max;
            guesses++;
            if (guess == numberToBeFound){
                System.out.printf("%d está correto.\n", guess);
                System.out.printf("Foram informados %d números, o menor foi %d e o maior %d.\n", guesses, min, max);
            } else {
                System.out.printf("%d é %s.\n", guess, guess < numberToBeFound ? "menor" : "maior");
            }
        }

    }

    public static int askForNumber(Scanner sc) {
        System.out.printf("Informe um número:\n");
        return Integer.parseInt(sc.nextLine());
    }
}
