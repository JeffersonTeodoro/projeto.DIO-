package br.com.jefferson.banking.facade;

import br.com.jefferson.banking.strategy.Account;
import br.com.jefferson.banking.strategy.DepositStrategy;
import br.com.jefferson.banking.strategy.WithdrawalStrategy;

public class BankFacade {

    private final Account account;
    private final DepositStrategy  depositStrategy;
    private final WithdrawalStrategy withdrawalStrategy;

    public BankFacade(Account account) {
        this.account = account;
        this.depositStrategy = new DepositStrategy();
        this.withdrawalStrategy = new WithdrawalStrategy();
    }

    public void deposit(double amount) {
        depositStrategy.execute(account, amount);
    }

    public void withdraw(double amount) {
        withdrawalStrategy.execute(account, amount);
    }

    public double getBalance() {
        return account.getBalance();
    }
}
