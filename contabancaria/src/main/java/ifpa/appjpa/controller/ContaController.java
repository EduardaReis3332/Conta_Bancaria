package ifpa.appjpa.controller;

import java.util.List;
import java.util.Optional;
import ifpa.appjpa.domain.Conta;
import ifpa.appjpa.domain.ContaRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping(value = "/conta")
public class ContaController {

    @Autowired
    private ContaRepo contaRepo;

    public ContaController() {
    }

    @GetMapping("/buscar/{id}")
    public Conta buscar(@PathVariable Long id) {
        System.out.println("pesquisando o ID = " + id);
        return contaRepo.findById(id).orElse(new Conta());
    }

    @PutMapping("/deposita/{id}")
    public ResponseEntity<String> deposita(@PathVariable Long id, @RequestParam float valor) {
        System.out.println("ID da conta para depósito: " + id);
        System.out.println("Valor do depósito: " + valor);

        Optional<Conta> contaOptional = contaRepo.findById(id);

        if (contaOptional.isPresent()) {
            Conta conta = contaOptional.get();
            float novoSaldo = conta.getSaldo() + valor;
            conta.setSaldo(novoSaldo);
            contaRepo.save(conta);
            String mensagem = "Depósito de R$" + valor + " realizado com sucesso. Novo saldo: R$" + novoSaldo;
            System.out.println(mensagem);
            return ResponseEntity.ok(mensagem);
        } else {
            System.out.println("Conta não encontrada para o ID: " + id);
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/retirada/{id}")
    public ResponseEntity<String> retirada(@PathVariable Long id, @RequestParam float valor) {
        System.out.println("ID da conta para retirada: " + id);
        System.out.println("Valor da retirada: " + valor);

        Optional<Conta> contaOptional = contaRepo.findById(id);

        if (contaOptional.isPresent()) {
            Conta conta = contaOptional.get();

            if (conta.getSaldo() >= valor) {
                float novoSaldo = conta.getSaldo() - valor;
                conta.setSaldo(novoSaldo);
                contaRepo.save(conta);
                String mensagem = "Retirada de R$" + valor + " realizada com sucesso. Novo saldo: R$" + novoSaldo;
                System.out.println(mensagem);
                return ResponseEntity.ok(mensagem);
            } else {
                System.out.println("Saldo insuficiente para a retirada. Saldo atual: R$" + conta.getSaldo());
                return ResponseEntity.badRequest().body("Saldo insuficiente para a retirada.");
            }
        } else {
            System.out.println("Conta não encontrada para o ID: " + id);
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/todos")
    public List<Conta> pesquisarTodos() {
        return contaRepo.findAll();
    }

    @PostMapping("/conta/salvar")
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
