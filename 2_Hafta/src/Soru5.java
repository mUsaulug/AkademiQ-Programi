import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Lütfen 10 kelime girin:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". kelimeyi girin: ");
            words.add(scanner.nextLine());
        }
        Collections.sort(words);
        System.out.println("Alfabetik sırayla: " + words);
    }
}
