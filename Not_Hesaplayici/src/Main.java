import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dersNotlari = new int[5];
        int toplamNot = 0;
        int enYuksekNot = 0;
        int enDusukNot = 100;
        boolean dusukNotVarmi = false;

        // Öğrencinin 5 dersten notlarını alıyoruz
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + ". dersi notunu girin: ");
            dersNotlari[i] = scanner.nextInt();

            // Toplam not hesaplanıyor
            toplamNot += dersNotlari[i];

            // En yüksek ve en düşük notlar belirleniyor
            if (dersNotlari[i] > enYuksekNot) {
                enYuksekNot = dersNotlari[i];
            }
            if (dersNotlari[i] < enDusukNot) {
                enDusukNot = dersNotlari[i];
            }

            // 30'un altındaki notlar için uyarı veriyoruz
            if (dersNotlari[i] < 30) {
                dusukNotVarmi = true;
            }
        }

        // Ortalama hesaplanıyor
        double ortalama = toplamNot / 5.0;
        System.out.println("\nNotlarınızın Ortalaması: " + ortalama);

        // Geçme durumu
        if (ortalama >= 50) {
            System.out.println("Tebrikler, geçtiğiniz dersler var!");
        } else {
            System.out.println("Üzgünüm, geçemediniz.");
        }

        // Düşük not uyarısı
        if (dusukNotVarmi) {
            System.out.println("Düşük not aldığınız dersler var!");
        }

        // En yüksek ve en düşük notlar
        System.out.println("En yüksek not: " + enYuksekNot);
        System.out.println("En düşük not: " + enDusukNot);
    }
}
