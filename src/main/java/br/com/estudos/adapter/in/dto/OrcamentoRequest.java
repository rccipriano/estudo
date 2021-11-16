package br.com.estudos.adapter.in.dto;

import lombok.Getter;

import java.util.List;

@Getter
public class OrcamentoRequest {

    private String nomeCliente;
    private String endereco;
    private List<OrcamentoItemRequest> orcamentoItemRequestList;

}
