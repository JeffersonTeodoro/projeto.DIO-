# 🏦 Banking Design Patterns — Java

Projeto desenvolvido durante os estudos de **Design Patterns com Java**, aplicando padrões de projeto clássicos em um domínio simplificado de operações bancárias.

O objetivo é demonstrar, de forma prática, como padrões de projeto podem ajudar na organização, reutilização e manutenção do código.

## 🎯 Objetivo

Este projeto simula operações básicas de uma conta bancária e utiliza diferentes **Design Patterns** para separar responsabilidades e organizar o fluxo das operações.

Entre os padrões trabalhados estão:

* **Strategy**
* **Facade**
* **Singleton**

O projeto também possui testes automatizados com **JUnit**, permitindo validar o comportamento das principais classes e operações.

## 🛠️ Tecnologias

* ☕ Java
* 📦 Maven
* 🧪 JUnit
* 🧩 Design Patterns
* 🏗️ Programação Orientada a Objetos

## 📐 Design Patterns utilizados

### Strategy

O padrão **Strategy** é utilizado para encapsular diferentes comportamentos de operações bancárias.

Neste projeto, foram utilizadas estratégias específicas para:

* Depósito
* Saque
* Operações de transação

Estrutura relacionada:

```text
strategy/
├── Account.java
├── DepositStrategy.java
├── TransactionStrategy.java
└── WithdrawalStrategy.java
```

Isso permite separar o comportamento de cada operação, evitando concentrar diferentes regras em uma única classe.

### Facade

O padrão **Facade** fornece uma interface simplificada para interação com os componentes do sistema.

```text
facade/
└── BankFacade.java
```

A ideia é esconder a complexidade interna das operações e disponibilizar uma forma mais simples de utilizar o sistema bancário.

### Singleton

O padrão **Singleton** é aplicado à configuração bancária.

```text
singleton/
└── BankConfiguration.java
```

O objetivo é garantir uma única instância da configuração utilizada pela aplicação.

## 📂 Estrutura do projeto

```text
src/
├── main/
│   └── java/
│       └── br/com/jefferson/banking/
│           ├── Main.java
│           │
│           ├── facade/
│           │   └── BankFacade.java
│           │
│           ├── singleton/
│           │   └── BankConfiguration.java
│           │
│           └── strategy/
│               ├── Account.java
│               ├── DepositStrategy.java
│               ├── TransactionStrategy.java
│               └── WithdrawalStrategy.java
│
└── test/
    └── java/
        └── br/com/jefferson/banking/
            ├── facade/
            │   └── BankFacadeTest.java
            │
            ├── singleton/
            │   └── BankConfigurationTest.java
            │
            └── strategy/
                ├── AccountTest.java
                ├── DepositStrategyTest.java
                └── WithdrawalStrategyTest.java
```

## 🧪 Testes

O projeto possui testes automatizados para os principais componentes:

* `AccountTest`
* `DepositStrategyTest`
* `WithdrawalStrategyTest`
* `BankFacadeTest`
* `BankConfigurationTest`

Para executar os testes:

```bash
./mvnw test
```

No Windows:

```powershell
.\mvnw.cmd test
```

## ▶️ Como executar

### Pré-requisitos

* Java instalado
* Maven instalado ou utilização do Maven Wrapper

Clone o repositório:

```bash
git clone https://github.com/JeffersonTeodoro/projeto.DIO-.git
```

Entre no diretório:

```bash
cd projeto.DIO-
```

Execute os testes:

```powershell
.\mvnw.cmd test
```

Para executar a aplicação, utilize a classe:

```text
br.com.jefferson.banking.Main
```

## 📚 Conceitos praticados

Este projeto foi desenvolvido com foco no aprendizado de:

* Programação Orientada a Objetos
* Encapsulamento
* Separação de responsabilidades
* Design Patterns
* Strategy Pattern
* Facade Pattern
* Singleton Pattern
* Testes unitários
* Maven
* Organização de projetos Java

## 🚀 Evolução do projeto

Este projeto representa uma etapa prática dos estudos de **Design Patterns em Java**.

A partir dos conceitos desenvolvidos aqui, uma segunda versão do projeto foi criada utilizando **Spring Boot**, aprofundando a aplicação dos padrões em uma estrutura mais próxima de aplicações backend modernas.

## 👨‍💻 Autor

**Jefferson França Teodoro**

Desenvolvedor Full Stack com foco em:

* Java
* Spring Boot
* JavaScript
* React
* APIs REST
* PostgreSQL
* Arquitetura de Software

🔗 GitHub: [JeffersonTeodoro](https://github.com/JeffersonTeodoro)

---

⭐ Se este projeto foi útil para seus estudos, considere deixar uma estrela no repositório!
