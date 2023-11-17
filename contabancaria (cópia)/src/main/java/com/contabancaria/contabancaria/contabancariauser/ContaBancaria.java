package com.contabancaria.contabancaria.contabancariauser;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class ContaBancaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCliente;

    private float saldo;
    
    @Version
    private Date ultmAlteracao;

    public ContaBancaria() {

    }

    public ContaBancaria(String nomeCliente, float saldo) {

        this.nomeCliente = nomeCliente;

        this.saldo = saldo;

    }

    public void depositar(float valor) {

        saldo += valor;

    }

    public void retirar(float valor) {

        saldo -= valor;

    }

    /*public void depositar(Long id, float valor) {
        ContaBancaria conta = repository.findById(id).orElseThrow(() -> new RuntimeException("Conta não encontrada"));
        conta.setSaldo(conta.getSaldo() + valor);
        repository.save(conta);
    }

    public void retirar(Long id, float valor) {
        ContaBancaria conta = repository.findById(id).orElseThrow(() -> new RuntimeException("Conta não encontrada"));
        if (conta.getSaldo() < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }
        conta.setSaldo(conta.getSaldo() - valor);
        repository.save(conta);
    }*/

    // getters and setters

    /*public Date getUltmAlteracao() {
        return ultmAlteracao;
    }

    public void setUltmAlteracao(Date ultmAlteracao) {
        this.ultmAlteracao = ultmAlteracao;
    }*/
    
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
