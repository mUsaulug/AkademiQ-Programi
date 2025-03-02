import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Soru4
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("10 adet sayı girin:");
        for (int i = 0; i < 10; i++)
        {
            numbers.add(scanner.nextInt());
        }


        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Büyükten küçüğe sıralı liste: " + numbers);
    }
}
