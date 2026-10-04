package br.com.jefferson.banking.strategy;

public class WithdrawalStrategy implements TransactionStrategy{

    @Override
    public void execute(Account account, double amount) {
        if (account.getBalance() < amount) {
            throw new IllegalStateException(
                    "Saldo insuficiente para realizar o saque."
            );
        }

        account.withdraw(amount);
    }
}
