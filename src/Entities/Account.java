package Entities;

import Interfaces.IAccount;

public abstract class Account implements IAccount {

    protected int bankBranch;
    protected int accountNumber;
    protected double balance;
    protected String accountType;
    protected Client client;
    
    private static int anumber = (int) (Math.random()*100000);
    
    public Account(Client client, Bank bank) {
        this.accountNumber = anumber++;
        this.bankBranch = bank.bankBranch;
        this.client = client;
    }

    public int getBankBranch() {
        return bankBranch;
    }
    
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    @Override
    public void withdraw(double value) {
        if(value > this.balance) {
            System.out.println("Operação negada. Valor acima do disponível.");
            return;
        }
        this.balance -= value;

        System.out.println(String.format("Saque de R$ %.2f", value ));
        System.out.println(String.format("Saldo atual R$ %.2f", this.balance));
    }

    @Override
    public void deposit(double value) {
        this.balance += value;

        System.out.println(String.format("Depósito de R$ %.2f", value ));
        System.out.println("Favorecido: " + this.client.getName());
    }

    @Override
    public void transfer(double value, Account destinationAccount) {
        if(value > this.balance) {
            System.out.println("Operação negada. Valor indisponível.");
            return;
        }
        this.balance -= value;
        destinationAccount.balance += value;
        
        System.out.println("\n------- Transferência -------");
        System.out.println("De: " + this.client.getName());
        System.out.println("Para: " + destinationAccount.client.getName());
        System.out.println(String.format("Valor: R$ %.2f", value));
        System.out.println();
    }
    
    protected void printAccountInfomation() {
        System.out.println(String.format("Titular: %s", this.client.getName()));  
        System.out.println(String.format("Agência: %d", this.bankBranch));
        System.out.println(String.format("Nº Conta: %d", this.accountNumber));
        System.out.println(String.format("Saldo: %.2f", this.balance));
        System.out.println();
    }
}
