package ulug.musa;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Ali", 10000);
        savings.displayInfo();
        savings.calculateInterest();
        System.out.println();

        BankAccount checking = new CheckingAccount("Veli", 5000);
        checking.displayInfo();
        checking.calculateInterest();
    }
}
