package Entities;

import Interfaces.IAccount;

public abstract class Account implements IAccount {

    private static final int BRANCH_PATTERN = 1;
    private static int SEQUENCIAL = 1;

    protected int bankBranch;
    protected int accountNumber;
    protected double balance;
    //protected Client client; - tb poderia o cliente ter uma conta.

    public Account() { // (Client client)
        this.bankBranch = Account.BRANCH_PATTERN;
        this.accountNumber = SEQUENCIAL++;
      //  this.client = client;
    }

    public int getBankBranch() {
        return bankBranch;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
        
    }

    @Override
    public void deposit(double value) {
        balance += value;
        
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
        
    }

    
    protected void printAccountInfomation() {
      //System.out.println(String.format("Titular: %s", this.client.getName()));  
        System.out.println(String.format("Agência: %d", this.bankBranch));
        System.out.println(String.format("Nº Conta: %d", this.accountNumber));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
    
}
