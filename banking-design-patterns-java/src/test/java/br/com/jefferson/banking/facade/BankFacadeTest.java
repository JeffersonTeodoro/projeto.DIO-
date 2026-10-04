package br.com.jefferson.banking.facade;

import br.com.jefferson.banking.strategy.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankFacadeTest {

    @Test
    void deveRealizarDeposito() {

        Account account = new Account("Jefferson");

        BankFacade bank = new BankFacade(account);

        bank.deposit(1000.00);

        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void deveRealizarSaque() {

        Account account = new Account("Jefferson");
        account.deposit(1000.00);

        BankFacade bank = new BankFacade(account);

        bank.withdraw(250.00);

        assertEquals(750.00, bank.getBalance());
    }

}
