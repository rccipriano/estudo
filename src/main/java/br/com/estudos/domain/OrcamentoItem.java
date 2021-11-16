package br.com.estudos.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity(name = "orcamentoitem")
@Builder
@Data
@Getter
public class OrcamentoItem {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    private final String id;
    private final Double quantidadeProduto;
    private final Double descontoProduto;
    private final double valorProduto;

    @ManyToOne(targetEntity=ItemEntity.class, fetch=FetchType.LAZY)
    @JoinColumn(name="id_item", nullable=false)
    @NotNull
    private final ItemEntity item;
}
