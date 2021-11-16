package br.com.estudos.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity(name = "orcamento")
@Data
public class Orcamento {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private String id;
    private String nomeCliente;
    private String endereco;
    private final double valor;
    @ManyToMany(cascade = CascadeType.ALL)
    private final List<OrcamentoItem> orcamentoItens;

    public Orcamento(double valor, List<OrcamentoItem> orcamentoItens) {
        this.valor = valor;
        this.orcamentoItens = orcamentoItens;
    }



}
