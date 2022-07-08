package Interfaces;

import Entities.Account;

public interface IAccount {
    void withdraw(double value);

    void deposit(double value);

    void transfer(double value, Account destinationAccount);

    void printBankStatement();
}
