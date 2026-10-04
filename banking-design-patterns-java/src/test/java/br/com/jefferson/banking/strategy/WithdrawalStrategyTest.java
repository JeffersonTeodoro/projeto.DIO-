package br.com.jefferson.banking.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithdrawalStrategyTest {

    @Test
    void deveRealizarSaqueQuandoHouverSaldo() {

        Account account = new Account("Jefferson");
        account.deposit(1000.00);

        WithdrawalStrategy strategy = new WithdrawalStrategy();

        strategy.execute(account, 250.00);

        assertEquals(750.00, account.getBalance());
    }

    @Test
    void deveLancarExcecaoQuandoSaldoForInsuficiente() {

        Account account = new Account("Jefferson");
        account.deposit(1000.00);

        WithdrawalStrategy strategy = new WithdrawalStrategy();

        assertThrows(
                IllegalStateException.class,
                () -> strategy.execute(account, 1500.00)
        );
    }
}