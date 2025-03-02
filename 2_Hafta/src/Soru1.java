import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int toplam = 0;

        System.out.println("Lütfen 10 sayı girin:");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i + 1) + ". sayıyı girin: ");
            numbers[i] = scanner.nextInt();
            toplam += numbers[i]; // Toplamı hesapla
        }

        double ortalama = (double) toplam / numbers.length;
        System.out.println("Dizinin ortalaması: " + ortalama);

        System.out.print("50’den büyük elemanlar: ");
        for (int num : numbers)
        {
            if (num > 50) {
                System.out.print(num + " ");
            }
        }
    }
}
