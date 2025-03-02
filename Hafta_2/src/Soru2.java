import java.util.HashSet;

public class Soru2 {
    public static void main(String[] args)
    {
        int[] numbers = {5, 3, 8, 3, 1, 5, 8};
        HashSet<Integer> tekrarEdenler = new HashSet<>();
        HashSet<Integer> kontrol = new HashSet<>();

        for (int num : numbers)
        {
            if (!kontrol.add(num))
            { // Daha önce eklenen bir eleman varsa tekrar ediyor demektir
                tekrarEdenler.add(num);
            }
        }

        System.out.println("Tekrar eden sayılar: " + tekrarEdenler);
    }
}
