package oop;

import java.util.*;

public class Bank {
    ArrayList<Account> accounts;
    private double total;

    public Bank(ArrayList<Account> accounts, double total) {
        this.accounts = accounts;
        this.total = total;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        this.total += account.getAmount();
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        this.total -= account.getAmount();
    }

    public void deposit(Account account, double amount) {
        this.total += amount;
        account.setAmount(account.getAmount() + amount);
    }

    public void withdraw(Account account, double amount) {
        this.total -= amount;
        account.setAmount(account.getAmount() - amount);
    }

    public double getTotal() {
        return this.total;
    }

    public ArrayList<Account> getAccounts() {
        return this.accounts;
    }
}
