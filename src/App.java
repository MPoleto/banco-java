import Entities.Account;
import Entities.CurrentAccount;
import Entities.SavingsAccount;

public class App {
    public static void main(String[] args) {
        Account cc = new CurrentAccount();
        cc.deposit(100);

        Account cp = new SavingsAccount();

        cc.transfer(100, cp);

        cc.printBankStatement();
        cp.printBankStatement();
    }
}
