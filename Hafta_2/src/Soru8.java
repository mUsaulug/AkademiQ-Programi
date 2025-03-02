import java.util.ArrayList;
import java.util.Collections;

public class Soru8
{
    public static void main(String[] args)
    {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(45);
        numbers.add(3);
        numbers.add(89);
        numbers.add(17);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
