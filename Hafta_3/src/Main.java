

public class Main {
    public static void main(String[] args)
    {
        Manager manager = new Manager(1, "Ahmet", 50000, "IT", 10);
        manager.displayInfo();
        System.out.println("Manager Bonus: " + manager.calculateBonus());
        System.out.println();

        Developer developer = new Developer(2, "Mehmet", 40000, "Software", "Java Developer");
        developer.displayInfo();
        System.out.println("Developer Bonus: " + developer.calculateBonus());
    }
}