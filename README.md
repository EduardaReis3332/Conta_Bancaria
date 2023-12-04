# Conta_Bancaria
Atividade Spring Web + Data (JPA) com testes no JMeter

Desenvolvido por: ***[Eduarda Reis](https://github.com/EduardaReis3332)*** e ***Eduardo Cordovil***

O projeto é composto pelas pastas: 

[ifpa.appjpa.domain](https://github.com/EduardaReis3332/Conta_Bancaria/tree/main/contabancaria%20(c%C3%B3pia)/src/main/java/ifpa/appjpa/domain) que contém os arquivos: Conta.java e ContaRepo.java;

[ifpa.apppjpa.controller](https://github.com/EduardaReis3332/Conta_Bancaria/tree/main/contabancaria%20(c%C3%B3pia)/src/main/java/ifpa/appjpa/controller) que contém o arquivo: ContaController.java;

e a classe executável é: [AppJpaApplication.java](https://github.com/EduardaReis3332/Conta_Bancaria/blob/main/contabancaria%20(c%C3%B3pia)/src/main/java/ifpa/appjpa/AppJpaApplication.java)

**Você encontrará o caso de teste na pasta: **/src/main/java/casodeteste/**[casodeteste.jmx](https://github.com/EduardaReis3332/Conta_Bancaria/blob/main/contabancaria%20(c%C3%B3pia)/src/main/java/casodeteste/contabancaria.jmx)**

Comando SQL para criar a e popular a tabela:
```sql
CREATE TABLE CONTA (
   ID INT AUTO_INCREMENT PRIMARY KEY, 
   NOME_CLIENTE VARCHAR, 
   SALDO FLOAT
);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (1,'João Silva', 1000.50);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (2, 'Maria Oliveira', 1500.75);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (3, 'Carlos Pereira', 800.20);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (4, 'Ana Souza', 2000.00);

INSERT INTO CONTA (ID, NOME_CLIENTE, SALDO)
VALUES (5, 'Luana Santos', 300.90);
```
