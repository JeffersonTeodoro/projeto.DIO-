package br.com.jefferson.banking.strategy;

public interface TransactionStrategy {

    void execute(Account account, double amount);
}
