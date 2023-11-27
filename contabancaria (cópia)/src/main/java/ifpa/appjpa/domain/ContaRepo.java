package ifpa.appjpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContaRepo extends JpaRepository<Conta, Long> {
}

/*
package ifpa.appjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ifpa.appjpa.controller.ContaController;
import ifpa.appjpa.domain.Conta;

@SpringBootApplication
public class AppJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AppJpaApplication.class, args);

        ContaController contaController = context.getBean(ContaController.class);

        // Criar conta
        Conta novaConta = new Conta("Nome do Cliente", 0);
        contaController.salvar(novaConta);

        // Buscar conta pelo ID
        Long idConta = novaConta.getId();
        Conta contaBuscada = contaController.buscar(idConta);
        System.out.println("Conta encontrada: " + contaBuscada.getNomeCliente() + " - Saldo: " + contaBuscada.getSaldo());

        // Depositar na conta
        Double valorDeposito = 100.00;
        contaController.depositar(idConta, valorDeposito);

        // Buscar conta novamente para verificar o saldo atualizado
        contaBuscada = contaController.buscar(idConta);
        System.out.println("Conta encontrada após depósito: " + contaBuscada.getNomeCliente() + " - Saldo: " + contaBuscada.getSaldo());

        // Retirar da conta
        Double valorRetirada = 50.00;
        contaController.retirar(idConta, valorRetirada);

        // Buscar conta novamente para verificar o saldo atualizado
        contaBuscada = contaController.buscar(idConta);
        System.out.println("Conta encontrada após retirada: " + contaBuscada.getNomeCliente() + " - Saldo: " + contaBuscada.getSaldo());

        // Deletar conta
        contaController.deletar(idConta);

        // Tentar buscar conta deletada para verificar se foi removida corretamente
        contaBuscada = contaController.buscar(idConta);
        System.out.println("Conta encontrada após deletar: " + contaBuscada.getNomeCliente() + " - Saldo: " + contaBuscada.getSaldo());
    }

}

*/