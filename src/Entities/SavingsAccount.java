package Entities;

public class SavingsAccount extends Account {
    
    @Override
    public void printBankStatement() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.printAccountInfomation();
    }
    
}
