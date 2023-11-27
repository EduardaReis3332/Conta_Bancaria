package ifpa.appjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppJpaApplication.class, args);
    }
}
/*
import org.junit.Test;
import static org.junit.Assert.*;

public class MeuTeste {

    @Test
    public void testAdicionarElemento() {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.adicionarElemento(10);
        assertEquals(1, minhaClasse.getLista().size());
        assertEquals(10, (int) minhaClasse.getLista().get(0));
    }

    @Test
    public void testRemoverElementoExistente() {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.adicionarElemento(10);
        minhaClasse.removerElemento(10);
        assertTrue(minhaClasse.getLista().isEmpty());
    }

    @Test
    public void testRemoverElementoInexistente() {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.adicionarElemento(10);
        minhaClasse.removerElemento(5);
        assertEquals(1, minhaClasse.getLista().size());
    }
}




import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankTest {
private Bank bank;

scss

@Before
public void setUp() {
    bank = new Bank();
}

@Test
public void testCreateAccount() {
    int accountNumber = bank.createAccount();
    assertEquals(1, accountNumber);
}

@Test
public void testDeposit() {
    int accountNumber = bank.createAccount();
    bank.deposit(accountNumber, 1000);
    assertEquals(1000, bank.getBalance(accountNumber));
}

@Test
public void testWithdraw() {
    int accountNumber = bank.createAccount();
    bank.deposit(accountNumber, 1000);
    bank.withdraw(accountNumber, 500);
    assertEquals(500, bank.getBalance(accountNumber));
}

@Test
public void testDeleteAccount() {
    int accountNumber = bank.createAccount();
    bank.deposit(accountNumber, 1000);
    bank.deleteAccount(accountNumber);
    assertEquals(0, bank.getBalance(accountNumber));
}

}





import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        int opcao = 0;
        do {
            System.out.println("==== Menu ====");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Remover");
            System.out.println("4 - Deletar conta");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Criar conta
                    System.out.print("Informe o número da conta: ");
                    int numeroConta = scanner.nextInt();
                    System.out.print("Informe o saldo inicial: ");
                    double saldoInicial = scanner.nextDouble();
                    Conta novaConta = new Conta(numeroConta, saldoInicial);
                    banco.adicionarConta(novaConta);
                    System.out.println("Conta criada com sucesso!");
                    break;
                case 2:
                    // Depositar
                    System.out.print("Informe o número da conta: ");
                    int numeroContaDeposito = scanner.nextInt();
                    System.out.print("Informe o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    boolean depositoRealizado = banco.depositar(numeroContaDeposito, valorDeposito);
                    if (depositoRealizado) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 3:
                    // Remover
                    System.out.print("Informe o número da conta: ");
                    int numeroContaRemover = scanner.nextInt();
                    boolean remocaoRealizada = banco.remover(numeroContaRemover);
                    if (remocaoRealizada) {
                        System.out.println("Conta removida com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 4:
                    // Deletar conta
                    System.out.print("Informe o número da conta: ");
                    int numeroContaDeletar = scanner.nextInt();
                    boolean contaDeletada = banco.deletarConta(numeroContaDeletar);
                    if (contaDeletada) {
                        System.out.println("Conta deletada com sucesso!");
                    } else {
                        System.out.println("Conta não encontrada!");
                    }
                    break;
                case 0:
                    // Sair
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }
}

*/