package br.com.estudos.adapter.in.dto;

import lombok.Builder;

@Builder
public class OrcamentoItemResponse {

    private String id;
    private Double quantidadeItem;
    private Double descontoItem;
    private String idItem;
}
