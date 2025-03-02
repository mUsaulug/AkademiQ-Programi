import java.util.ArrayList;

public class Soru9
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.get(1));
        list.set(1, 50);
        list.remove(0);
        System.out.println(list.size());
        list.clear();
    }
}
