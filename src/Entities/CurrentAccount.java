package Entities;

public class CurrentAccount extends Account {
   
    private static final String CURRENT = "Conta Corrente";
    
    public CurrentAccount(Client client, Bank bank) {
        super(client, bank);
        this.accountType = CurrentAccount.CURRENT;
    }
    
    @Override
    public void printBankStatement() {
        System.out.println("--- Extrato Conta Corrente ---");
        super.printAccountInfomation();
    }
}
