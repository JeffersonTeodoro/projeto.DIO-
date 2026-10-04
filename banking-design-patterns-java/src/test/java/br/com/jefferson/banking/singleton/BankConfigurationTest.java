package br.com.jefferson.banking.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankConfigurationTest {

    @Test
    void deveRetornarSempreAMesmaInstancia() {

        BankConfiguration config1 =
                BankConfiguration.getInstance();

        BankConfiguration config2 =
                BankConfiguration.getInstance();

        assertSame(config1, config2);
    }

    @Test
    void deveCompartilharConfiguracaoEntreAsInstancias() {

        BankConfiguration config1 =
                BankConfiguration.getInstance();

        config1.setEnvironment("TEST");

        BankConfiguration config2 =
                BankConfiguration.getInstance();

        assertEquals("TEST", config2.getEnvironment());
    }
}