package Entities;

import java.time.LocalDate;
import java.time.Period;

public class SavingsAccount extends Account {
    
    private static final String SAVINGS = "Conta Poupança";

    public SavingsAccount(Client client, Bank bank) {
        super(client, bank);
        this.accountType = SAVINGS;
    }

    @Override
    public void withdraw(double value) {
        Period age = Period.between(client.getBirthday(), LocalDate.now());
        
        if (age.getYears() < 18) {
            System.out.println("Acesso negado. Saque não permitido.");
            return;
        }
        super.withdraw(value);
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        Period age = Period.between(client.getBirthday(), LocalDate.now());
        
        if (age.getYears() < 18) {
            System.out.println("Acesso negado. Transferência não permitida.");
            return;
        }
        super.transfer(value, destinationAccount);
    }

    @Override
    public void printBankStatement() {
        System.out.println("--- Extrato Conta Poupança ---");
        super.printAccountInfomation();
    }
}
