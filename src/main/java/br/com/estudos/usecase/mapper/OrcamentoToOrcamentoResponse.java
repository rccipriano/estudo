package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.OrcamentoResponse;
import br.com.estudos.domain.Orcamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OrcamentoToOrcamentoResponse {

    @Mappings({
            @Mapping(target="nomeCliente", source="orcamento.nomeCliente"),
            @Mapping(target="endereco", source="orcamento.endereco"),
            @Mapping(target="orcamentoResponseList", source="orcamento.orcamentoItens")
    })
    OrcamentoResponse toOrcamentoResponse (Orcamento orcamento);
}
