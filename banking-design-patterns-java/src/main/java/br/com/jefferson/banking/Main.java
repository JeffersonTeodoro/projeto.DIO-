package br.com.jefferson.banking;

import br.com.jefferson.banking.facade.BankFacade;
import br.com.jefferson.banking.strategy.Account;

public class Main {

    public static void main(String[] args) {

        Account account = new Account("Jefferson");

        BankFacade bank = new BankFacade(account);

        bank.deposit(1000.00);

        System.out.println(
                "Saldo após depósito: R$ "
                        + bank.getBalance()
        );

        bank.withdraw(250.00);

        System.out.println(
                "Saldo após saque: R$ "
                        + bank.getBalance()
        );
    }
}