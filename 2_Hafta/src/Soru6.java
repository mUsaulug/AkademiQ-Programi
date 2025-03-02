import java.util.ArrayList;
import java.util.Random;

public class Soru6
{
    public static void main(String[] args)
    {

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 20; i++)
        {
            int num = random.nextInt(100);
            numbers.add(num);
            if (num % 2 == 0) evenNumbers.add(num);
        }


        System.out.println("Tüm sayılar: " + numbers);
        System.out.println("Çift sayılar: " + evenNumbers);

    }
}
