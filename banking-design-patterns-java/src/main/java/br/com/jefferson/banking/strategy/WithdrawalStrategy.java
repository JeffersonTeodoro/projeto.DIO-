package br.com.jefferson.banking.strategy;

public class WithdrawalStrategy implements TransactionStrategy{

    @Override
    public void execute(Account account, double amount) {
        account.withdraw(amount);
    }
}
