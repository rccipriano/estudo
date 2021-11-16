package br.com.estudos.adapter.in.dto;

import br.com.estudos.domain.ItemEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrcamentoItemRequest {


    private Double quantidadeItem;
    private Double descontoItem;
    private String idItem;
}
