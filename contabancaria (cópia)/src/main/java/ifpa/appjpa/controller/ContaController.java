package ifpa.appjpa.controller;

import java.util.List;
import ifpa.appjpa.domain.Conta;
import ifpa.appjpa.domain.ContaRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{id}")
    public Conta buscar(@PathVariable Long id) {
        System.out.println("pesquisando o ID = " + id);
        return contaRepo.findById(id).orElse(new Conta());
    }

    @PostMapping("/depositar/{id}")
    public Conta depositar(@PathVariable Long id, @RequestBody Float valor) {
        Conta conta = contaRepo.findById(id).orElse(new Conta());
        Float novoSaldo = conta.getSaldo() + valor;
        conta.setSaldo(novoSaldo);
        return contaRepo.save(conta);
    }

    @PostMapping("/retirar/{id}")
    public Conta retirar(@PathVariable Long id, @RequestBody Float valor) {
        Conta conta = contaRepo.findById(id).orElse(new Conta());
        Float novoSaldo = conta.getSaldo() - valor;
        conta.setSaldo(novoSaldo);
        return contaRepo.save(conta);
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
