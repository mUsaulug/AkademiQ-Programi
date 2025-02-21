import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pin = 1234;
        double balance = 1000.0;
        int attempts = 3;

        System.out.println("ATM'ye Hoş Geldiniz!");

        // PIN doğrulama
        while (attempts > 0) {
            System.out.print("Lütfen 4 haneli PIN kodunuzu girin: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == pin) {
                System.out.println("Giriş başarılı!");

                while (true) {
                    // Menü
                    System.out.println("\nLütfen bir işlem seçin:");
                    System.out.println("1. Bakiye Görüntüleme");
                    System.out.println("2. Para Yatırma");
                    System.out.println("3. Para Çekme");
                    System.out.println("4. Çıkış");
                    System.out.print("Seçiminiz: ");
                    int choice = scanner.nextInt();

                    if (choice == 1) {
                        System.out.println("Güncel Bakiyeniz: " + balance + "₺");
                    }
                    else if (choice == 2) {
                        System.out.print("Yatırmak istediğiniz miktarı girin: ");
                        double amount = scanner.nextDouble();

                        if (amount > 0) {
                            balance += amount;
                            System.out.println(amount + "₺ yatırıldı. Yeni bakiye: " + balance + "₺");
                        } else {
                            System.out.println("Geçersiz tutar!");
                        }
                    }
                    else if (choice == 3) {
                        System.out.print("Çekmek istediğiniz miktarı girin: ");
                        double amount = scanner.nextDouble();

                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.println(amount + "₺ çekildi. Kalan bakiye: " + balance + "₺");
                        } else if (amount > balance) {
                            System.out.println("Yetersiz bakiye! Mevcut bakiyeniz: " + balance + "₺");
                        } else {
                            System.out.println("Geçersiz tutar!");
                        }
                    }
                    else if (choice == 4) {
                        System.out.println("Çıkış yapılıyor... Teşekkürler!");
                        return;
                    }
                    else {
                        System.out.println("Geçersiz seçim! Lütfen 1-4 arasında bir değer girin.");
                    }
                }
            } else {
                attempts--;
                System.out.println("Yanlış PIN! Kalan hakkınız: " + attempts);
                if (attempts == 0) {
                    System.out.println("Çok fazla yanlış deneme! Hesap kilitlendi.");
                    return;
                }
            }
        }
    }
}
