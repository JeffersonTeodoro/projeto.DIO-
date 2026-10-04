package br.com.jefferson.banking.strategy;

public class Account {

    private String holder;
    private double balance;

    public Account(String holder) {
        this.holder = holder;
        this.balance = 0.0;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}