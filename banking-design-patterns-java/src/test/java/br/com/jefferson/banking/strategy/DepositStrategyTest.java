package br.com.jefferson.banking.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepositStrategyTest {

    @Test
    void deveRealizarDepositoQuandoValorForValido() {

        Account account = new Account("Jefferson");

        DepositStrategy strategy = new DepositStrategy();

        strategy.execute(account, 1000.00);

        assertEquals(1000.00, account.getBalance());
    }

    @Test
    void deveLancarExcecaoQuandoValorForZero() {

        Account account = new Account("Jefferson");

        DepositStrategy strategy = new DepositStrategy();

        assertThrows(
                IllegalArgumentException.class,
                () -> strategy.execute(account, 0.00)
        );
    }

    @Test
    void deveLancarExcecaoQuandoValorForNegativo() {

        Account account = new Account("Jefferson");

        DepositStrategy strategy = new DepositStrategy();

        assertThrows(
                IllegalArgumentException.class,
                () -> strategy.execute(account, -100.00)
        );
    }
}