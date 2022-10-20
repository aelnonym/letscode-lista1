import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = askForNumber(sc);
        String words[] = readArray(sc, size);
        printArray(0, words.length, 1, words);
        printArray(words.length - 1, 0, -1, words);

    }

    public static void printArray(int init, int end, int step, String[] array){
        System.out.print("[");
        for(int i = init; i < end; i += step){
            System.out.printf("%s, ", array[i]);
        }
        System.out.printf("]");
    }

    public static String[] readArray(Scanner sc, int size){
        String words[] = new String[size];
        for(int i = 0; i < size; i++){
            System.out.printf("Informe a palavra %s: \n", i+1);
            words[i] = sc.nextLine();
//            words[i] = askForString(i, sc);
        }
        return words;
    }

    public static int askForNumber(Scanner sc) {
        System.out.printf("Quantas palavras serão informadas?\n");
        return Integer.parseInt(sc.nextLine());
    }

    public static String askForString(int pos, Scanner sc) {
        System.out.printf("Informe a palavra %s: \n", pos+1);
        return sc.nextLine();
    }
}
