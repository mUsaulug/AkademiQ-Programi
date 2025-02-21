import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double toplamHesap = 0.0;
        int secim;

        do {
            // Menü seçenekleri
            System.out.println("\nRestoran Menüsü:");
            System.out.println("1. Pizza - 40 TL");
            System.out.println("2. Hamburger - 25 TL");
            System.out.println("3. Salata - 15 TL");
            System.out.println("4. Çorba - 20 TL");
            System.out.println("5. Tatlı - 10 TL");
            System.out.println("0. Siparişi Tamamla");

            // Kullanıcıdan yemek seçimi alınıyor
            System.out.print("Bir yemek seçin (0-5): ");
            secim = scanner.nextInt();

            // Seçilen yemeğe göre fiyat ekleniyor
            switch (secim) {
                case 1:
                    toplamHesap += 40;
                    System.out.println("Pizza eklendi.");
                    break;
                case 2:
                    toplamHesap += 25;
                    System.out.println("Hamburger eklendi.");
                    break;
                case 3:
                    toplamHesap += 15;
                    System.out.println("Salata eklendi.");
                    break;
                case 4:
                    toplamHesap += 20;
                    System.out.println("Çorba eklendi.");
                    break;
                case 5:
                    toplamHesap += 10;
                    System.out.println("Tatlı eklendi.");
                    break;
                case 0:
                    System.out.println("Sipariş tamamlanıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }

        } while (secim != 0);  // Kullanıcı '0' seçeneğini seçene kadar devam eder

        // Sipariş tamamlandığında toplam hesap yazdırılır
        System.out.println("\nToplam Hesap: " + toplamHesap + " TL");
        scanner.close();
    }
}
