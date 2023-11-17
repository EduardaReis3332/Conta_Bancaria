CREATE TABLE CONTA (
   ID INT PRIMARY KEY, 
   NomeCliente VARCHAR, 
   SALDO FLOAT, 
   DataMovimento DATE,
   UltmAlteracao DATE
);

-- Dados tabela CONTA
INSERT INTO CONTA (ID, NomeCliente, SALDO, DataMovimento)
VALUES (1, 'João Silva', 1000.50, '2023-11-01');

INSERT INTO CONTA (ID, NomeCliente, SALDO, DataMovimento)
VALUES (2, 'Maria Oliveira', 1500.75, '2023-11-02');

INSERT INTO CONTA (ID, NomeCliente, SALDO, DataMovimento)
VALUES (3, 'Carlos Pereira', 800.20, '2023-11-03');

INSERT INTO CONTA (ID, NomeCliente, SALDO, DataMovimento)
VALUES (4, 'Ana Souza', 2000.00, '2023-11-04');

INSERT INTO CONTA (ID, NomeCliente, SALDO, DataMovimento)
VALUES (5, 'Luana Santos', 300.90, '2023-11-05');
