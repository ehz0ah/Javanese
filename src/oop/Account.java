package oop;

public class Account {
    private final int accountId;
    private final String ownerName;
    private double amount;

    public Account(int accountId, String ownerName, double amount) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        this.amount = amount;
    }

    public int getAccountId() {
        return this.accountId;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
