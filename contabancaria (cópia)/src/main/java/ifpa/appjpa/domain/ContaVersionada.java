package ifpa.appjpa.domain;

import java.util.Date;
import javax.persistence.Id;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Version;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class ContaVersionada implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nomeCliente;

    private float saldo;

    @Version
    private Date ultmAlteracao;

    public ContaVersionada() {}

    public ContaVersionada(String nomeCliente, float saldo) {

        this.nomeCliente = nomeCliente;

        this.saldo = saldo;
    }

    public Date getUltmAlteracao() {
        return ultmAlteracao;
    }

    public void setUltmAlteracao(Date ultmAlteracao) {
        this.ultmAlteracao = ultmAlteracao;
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
