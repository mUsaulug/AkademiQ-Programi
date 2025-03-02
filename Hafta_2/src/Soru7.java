import java.util.ArrayList;
import java.util.Scanner;

public class Soru7
{
    public static void main(String[] args)
    {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");
        cities.add("Bursa");
        cities.add("Antalya");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir şehir adı girin: ");
        String city = scanner.nextLine();

        if (cities.contains(city))
        {
            System.out.println(city + " listede var, indeksi: " + cities.indexOf(city));
        } else
        {
            System.out.println(city + " listede bulunamadı.");
        }
    }
}
