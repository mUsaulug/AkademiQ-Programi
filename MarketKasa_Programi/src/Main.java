import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalPrice = 0;
        final String DISCOUNT_CODE = "INDIRIM10"; // Sabit indirim kodu

        System.out.println("Market Kasa Programı");
        System.out.println("Ürünler:");
        System.out.println("1 - Elma (30 TL/kg)");
        System.out.println("2 - Süt (25 TL/L)");
        System.out.println("3 - Ekmek (10 TL/adet)");
        System.out.println("0 - Alışverişi Tamamla");

        while (true) {
            System.out.print("\nLütfen bir ürün seçin (0 ile çıkış yapabilirsiniz): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            System.out.print("Kaç adet/kg almak istiyorsunuz?: ");
            int quantity = scanner.nextInt();

            switch (choice) {
                case 1 -> totalPrice += quantity * 30;  // Elma 30 TL/kg
                case 2 -> totalPrice += quantity * 25;  // Süt 25 TL/L
                case 3 -> totalPrice += quantity * 10;  // Ekmek 10 TL/adet
                default -> System.out.println("Geçersiz ürün seçimi!");
            }
        }

        System.out.print("İndirim kuponunuz varsa kodu girin (Yoksa boş bırakın): ");
        scanner.nextLine(); // Önceki satırın enter karakterini temizle
        String enteredCode = scanner.nextLine();

        if (enteredCode.equals(DISCOUNT_CODE)) {
            totalPrice *= 0.90; // %10 indirim uygulanıyor
            System.out.println("İndirim uygulandı!");
        } else if (!enteredCode.isEmpty()) {
            System.out.println("Geçersiz indirim kodu!");
        }

        System.out.println("\nToplam Ödenecek Tutar: " + totalPrice + " TL");
        System.out.println("Ödeme işlemi tamamlandı. Teşekkürler!");
    }
}
