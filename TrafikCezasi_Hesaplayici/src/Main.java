import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HIZ_SINIRI = 90;

        System.out.print("Lütfen hızınızı girin (km/s): ");
        int hiz = scanner.nextInt();

        if (hiz <= HIZ_SINIRI) {
            System.out.println("Hız sınırını aşmadınız, iyi yolculuklar!");
        } else {
            int ceza = 0;

            switch (hiz) {
                case 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
                     101, 102, 103, 104, 105, 106, 107, 108, 109, 110:
                    ceza = 1000;
                    break;
                case 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                     121, 122, 123, 124, 125, 126, 127, 128, 129, 130:
                    ceza = 2000;
                    break;
                default:
                    System.out.println("Hız sınırını aştınız! Ehliyetinize el konuldu.");
                    return;
            }

            System.out.println("Hız sınırını aştınız! Ceza miktarı: " + ceza + " TL");
        }
    }
}
