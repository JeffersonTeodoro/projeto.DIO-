package br.com.jefferson.banking.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AccountTest {

    @Test
    void deveRealizarDeposito() {

        Account account = new Account("Jefferson");

        account.deposit(1000.00);

        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void deveRealizarSaqueQuandoHouverSaldo() {

        Account account = new Account("Jefferson");

        account.deposit(1000.00);
        account.withdraw(250.00);

        assertEquals(750.00, account.getBalance());
    }

    @Test
    void deveImpedirSaqueMaiorQueSaldo() {

        Account account = new Account("Jefferson");

        account.deposit(1000.00);

        assertThrows(
                IllegalStateException.class,
                () -> account.withdraw(1500.00)
        );
    }
}