package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.OrcamentoItemRequest;
import br.com.estudos.adapter.in.dto.OrcamentoRequest;
import br.com.estudos.domain.Orcamento;
import br.com.estudos.domain.OrcamentoItem;
import br.com.estudos.domain.OrcamentoItem.OrcamentoItemBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-21T16:55:31-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_292 (Private Build)"
)
@Component
public class OrcamentoRequestToOrcamentoEntityMapperImpl implements OrcamentoRequestToOrcamentoEntityMapper {

    @Override
    public Orcamento toOrcamento(OrcamentoRequest orcamentoRequest) {
        if ( orcamentoRequest == null ) {
            return null;
        }

        List<OrcamentoItem> orcamentoItens = null;

        orcamentoItens = orcamentoItemRequestListToOrcamentoItemList( orcamentoRequest.getOrcamentoItemRequestList() );

        double valor = 0.0d;

        Orcamento orcamento = new Orcamento( valor, orcamentoItens );

        orcamento.setNomeCliente( orcamentoRequest.getNomeCliente() );
        orcamento.setEndereco( orcamentoRequest.getEndereco() );

        return orcamento;
    }

    protected OrcamentoItem orcamentoItemRequestToOrcamentoItem(OrcamentoItemRequest orcamentoItemRequest) {
        if ( orcamentoItemRequest == null ) {
            return null;
        }

        OrcamentoItemBuilder orcamentoItem = OrcamentoItem.builder();

        return orcamentoItem.build();
    }

    protected List<OrcamentoItem> orcamentoItemRequestListToOrcamentoItemList(List<OrcamentoItemRequest> list) {
        if ( list == null ) {
            return null;
        }

        List<OrcamentoItem> list1 = new ArrayList<OrcamentoItem>( list.size() );
        for ( OrcamentoItemRequest orcamentoItemRequest : list ) {
            list1.add( orcamentoItemRequestToOrcamentoItem( orcamentoItemRequest ) );
        }

        return list1;
    }
}
