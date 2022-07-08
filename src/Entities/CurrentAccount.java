package Entities;

public class CurrentAccount extends Account {

    // public CurrentAccount(Client client) {
    //     super(client);
    // }

    @Override
    public void printBankStatement() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.printAccountInfomation();
    }


}
