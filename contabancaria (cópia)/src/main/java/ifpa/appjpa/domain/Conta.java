package ifpa.appjpa.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCliente;

    private float saldo;  
    
  //  @Version
    //private Date ultmAlteracao;

    public Conta() {

    }

    public Conta(String nomeCliente, float saldo) {

        this.nomeCliente = nomeCliente;

        this.saldo = saldo;

    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public void retirar(float valor) {
        saldo -= valor;
    }

    // getters and setters
    
   //  public Date getUltmAlteracao() {
   //     return ultmAlteracao;
   // }

   // public void setUltmAlteracao(Date ultmAlteracao) {
   //     this.ultmAlteracao = ultmAlteracao;
   // }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

/*
package ifpa.appjpa.controller;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ifpa.appjpa.domain.Conta;
import ifpa.appjpa.domain.ContaRepo;

@SpringBootTest
public class ContaControllerTest {

    @Autowired
    private ContaRepo contaRepo;

    @Test
    public void testCRUD() {
        // Cria uma nova conta
        Conta conta = new Conta("Cliente 1", 100.0f);

        // Salva a conta no banco de dados
        conta = contaRepo.save(conta);

        // Busca a conta pelo ID
        Conta contaBuscada = contaRepo.findById(conta.getId()).orElse(null);
        System.out.println("Conta buscada: " + contaBuscada);

        // Deposita 50 na conta
        contaBuscada.depositar(50.0f);
        contaRepo.save(contaBuscada);

        // Retira 20 da conta
        contaBuscada.retirar(20.0f);
        contaRepo.save(contaBuscada);

        // Lista todas as contas
        List<Conta> contas = contaRepo.findAll();
        System.out.println("Lista de contas:");
        for (Conta c : contas) {
            System.out.println(c);
        }

        // Deleta a conta
        contaRepo.deleteById(conta.getId());
    }
}

















Os métodos CRUD (Create, Read, Update, Delete) são responsáveis por realizar operações básicas em um banco de dados. No caso do código fornecido, já existem os métodos para listar, adicionar, remover e atualizar uma conta (pesquisar, salvar, deletar e alterar). Para implementar os métodos retirar, depositar e pesquisarTodos, você pode fazer o seguinte:

    Método "retirar":

less

@PostMapping("/retirar/{id}")
public Conta retirar(@PathVariable Long id, @RequestBody Double valor) {
    Conta conta = contaRepo.findById(id).orElse(new Conta());
    Double novoSaldo = conta.getSaldo() - valor;
    conta.setSaldo(novoSaldo);
    return contaRepo.save(conta);
}

    Método "depositar":

less

@PostMapping("/depositar/{id}")
public Conta depositar(@PathVariable Long id, @RequestBody Double valor) {
    Conta conta = contaRepo.findById(id).orElse(new Conta());
    Double novoSaldo = conta.getSaldo() + valor;
    conta.setSaldo(novoSaldo);
    return contaRepo.save(conta);
}

    Método "pesquisarTodos":

kotlin

@GetMapping("/todos")
public List<Conta> pesquisarTodos() {
    return contaRepo.findAll();
}

Com essas adições, o código completo ficaria assim:

less

package ifpa.appjpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ifpa.appjpa.domain.Conta;
import ifpa.appjpa.domain.ContaRepo;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

    @Autowired
    private ContaRepo contaRepo;

    public ContaController() {
    }

    @GetMapping("/{id}")
    public Conta buscar(@PathVariable Long id) {
        System.out.println("pesquisando o ID = " + id);
        return contaRepo.findById(id).orElse(new Conta());
    }

    @PostMapping("/depositar/{id}")
    public Conta depositar(@PathVariable Long id, @RequestBody Double valor) {
        Conta conta = contaRepo.findById(id).orElse(new Conta());
        Double novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);
        return contaRepo.save(conta);
    }

    @PostMapping("/retirar/{id}")
    public Conta retirar(@PathVariable Long id, @RequestBody Double valor) {
        Conta conta = contaRepo.findById(id).orElse(new Conta());
        Double novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
        return contaRepo.save(conta);
    }

    @GetMapping("/todos")
    public List<Conta> pesquisarTodos() {
        return contaRepo.findAll();
    }

    @PostMapping
    public Conta salvar(@RequestBody Conta conta) {
        return contaRepo.save(conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        contaRepo.deleteById(id);
    }

    @PutMapping
    public Conta alterar(@RequestBody Conta conta) {
        return contaRepo.save(conta);
    }

}
*/
