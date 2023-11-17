package com.contabancaria.contabancaria.controller;

import com.contabancaria.contabancaria.contabancariauser.ContaBancaria;
import com.contabancaria.contabancaria.contabancariauser.ContaBancariaRepository;
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

@RestController
@RequestMapping(value = "/contas")
public class ContaBancariaController {

    @Autowired
    private ContaBancariaRepository contaBancariaRepository;

    public ContaBancariaController() {
    }

    @GetMapping("/{id}")
    public ContaBancaria buscar(@PathVariable Long id) {
        System.out.println("pesquisando o ID = " + id);
        return contaBancariaRepository.findById(id).orElse(new ContaBancaria());
    }

    @GetMapping
    public List<ContaBancaria> pesquisar() {
        return contaBancariaRepository.findAll();
    }

    @PostMapping("/depositar/{id}")
    public ContaBancaria depositar(@RequestBody ContaBancaria conta) {
        return contaBancariaRepository.save(conta);
    }

    @PostMapping("/retirar/{id}")
    public ContaBancaria retirar(@RequestBody ContaBancaria conta) {
        return contaBancariaRepository.save(conta);
    }

    @PostMapping
    public ContaBancaria salvar(@RequestBody ContaBancaria conta) {
        return contaBancariaRepository.save(conta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        contaBancariaRepository.deleteById(id);
    }

    @PutMapping
    public ContaBancaria alterar(@RequestBody ContaBancaria conta) {
        return contaBancariaRepository.save(conta);
    }
}
