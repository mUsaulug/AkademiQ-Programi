import java.util.Scanner;

public class Soru3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int pozitifToplam = 0, negatifToplam = 0;


        System.out.println("10 adet sayı girin:");
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > 0)
            {
                pozitifToplam += numbers[i];
            }
            else negatifToplam += numbers[i];
        }


        System.out.println("Pozitif sayıların toplamı: " + pozitifToplam);
        System.out.println("Negatif sayıların toplamı: " + negatifToplam);
    }
}
