package br.com.estudos.adapter.in.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class OrcamentoResponse {

    private String id;
    private String nomeCliente;
    private String endereco;
    private List<OrcamentoResponse> orcamentoResponseList;

}
