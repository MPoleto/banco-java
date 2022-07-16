import Entities.Account;
import Entities.Bank;
import Entities.Client;
import Entities.CurrentAccount;
import Entities.SavingsAccount;
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Bank money = new Bank("Money", "76.521.311/0002-19", 34142555L, "moneybank@bank.com", "Rua Marechal, 59");
        
        Client alice = new Client("Alice Silva", LocalDate.of(2000, 11, 5), "282.445.466-67", 11999343424L, "alice@email.com", "Rua das Árvores, 239");
        Client helena = new Client("Helena Martins", LocalDate.of(2010, 4, 16), "745.235.907-52", 11991725619L, "helena@email.com", "Avenida Ruela,7637");
        Client matheus = new Client("Matheus de Carvalho", LocalDate.of(1992, 9, 21), "654.160.193-75", 11984875674L, "matheus@email.com", "Rua Sete de Setembro, 84");
        Client bernardo = new Client("Bernardo dos Santos", LocalDate.of(1967, 2, 7), "934.739.634-76", 11998354094L, "bernardo@email.com", "Rua São Luís, 3");

        Account cCurrent = new CurrentAccount(alice, money);
        Account cSavings = new SavingsAccount(helena, money);
        Account cSavings1 = new SavingsAccount(matheus, money);
        Account cCurrent1 = new CurrentAccount(bernardo, money);
        
        List<Account> accountsList = new ArrayList<Account>();
        accountsList.add(cCurrent);
        accountsList.add(cSavings);
        accountsList.add(cSavings1);
        accountsList.add(cCurrent1);

        money.setAccounts(accountsList);
        money.displayList();
        
        System.out.println("------------------------------------------------------------------------");
        
        cCurrent.deposit(300);
        System.out.println();
        cSavings1.deposit(2150);

        cCurrent.transfer(210.50, cSavings);
        
        System.out.println("\nSaque - CC - Bernardo");
        cCurrent1.withdraw(75);
        
        System.out.println("\nPoupança - Helena - menor de 18 anos");
        cSavings.withdraw(50);
        cSavings.transfer(50.15, cCurrent1);

        System.out.println("\nPoupança - Matheus - maior de 18 anos");
        cSavings1.withdraw(30);
        cSavings1.transfer(269.90, cCurrent1);

        System.out.println("------------------------------------------------------------------------");

        cCurrent.printBankStatement();
        cSavings.printBankStatement();
        cSavings1.printBankStatement();
        cCurrent1.printBankStatement();
    }
}
