package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.ItemRequest;
import br.com.estudos.adapter.in.dto.OrcamentoRequest;
import br.com.estudos.domain.ItemEntity;
import br.com.estudos.domain.Orcamento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface OrcamentoRequestToOrcamentoEntityMapper {

    @Mappings({
            @Mapping(target="nomeCliente", source="orcamentoRequest.nomeCliente"),
            @Mapping(target="endereco", source="orcamentoRequest.endereco"),
            @Mapping(target="orcamentoItens", source="orcamentoRequest.orcamentoItemRequestList")
    })
    Orcamento toOrcamento (OrcamentoRequest orcamentoRequest );
}
