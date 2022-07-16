package Entities;

import java.util.List;

public class Bank {
    private String name;
    protected int bankBranch;
    private String cnpj;
    private long telephone;
    private String email;
    private String address;
    private List<Account> accounts;
    
    private static final int BRANCH_PATTERN = (int) (Math.random()*10000);
    
    public Bank(String name, String cnpj, long telephone, String email, String address) {
        this.name = name;
        this.bankBranch = Bank.BRANCH_PATTERN;
        this.cnpj = cnpj;
        this.telephone = telephone;
        this.email = email;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getBankBranch() {
        return bankBranch;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public long getTelephone() {
        return telephone;
    }
    
    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public List<Account> getAccounts() {
    return accounts;
    }
    
    public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
    }

    public void displayList() {
        if(accounts == null || accounts.size() == 0) {
            System.out.println("A lista está vazia");
        } else {
            System.out.println("Lista de Contas:\n");

            for(int i = 0; i < accounts.size(); i++){
                System.out.println(i+1 + "- " + accounts.get(i).accountType + 
                ", Conta: " + accounts.get(i).accountNumber + 
                ", Cliente: " + accounts.get(i).client.getName());
            }
        }
    }
}
