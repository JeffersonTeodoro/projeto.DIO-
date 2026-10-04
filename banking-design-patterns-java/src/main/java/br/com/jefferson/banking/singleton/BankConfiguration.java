package br.com.jefferson.banking.singleton;

public class BankConfiguration {

    private static BankConfiguration instance;
    private String environment;

    private BankConfiguration() {
    }

    public static BankConfiguration getInstance() {
        if (instance == null) {
            instance = new BankConfiguration();
        }

        return instance;
    }

    public String getBankName() {
        return "Jefferson Bank";
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
