package br.com.jefferson.banking.strategy;

public class DepositStrategy implements TransactionStrategy{

    @Override
    public void execute(Account account, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero.");
        }
        account.deposit(amount);
    }
}
