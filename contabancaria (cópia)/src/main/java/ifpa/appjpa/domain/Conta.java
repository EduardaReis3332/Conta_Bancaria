package ifpa.appjpa.domain;

import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Conta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCliente;

    private float saldo;

    public Conta() {}

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
