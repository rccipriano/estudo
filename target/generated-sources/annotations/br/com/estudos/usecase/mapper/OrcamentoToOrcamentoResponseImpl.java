package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.OrcamentoResponse;
import br.com.estudos.adapter.in.dto.OrcamentoResponse.OrcamentoResponseBuilder;
import br.com.estudos.domain.Orcamento;
import br.com.estudos.domain.OrcamentoItem;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-21T16:55:32-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_292 (Private Build)"
)
@Component
public class OrcamentoToOrcamentoResponseImpl implements OrcamentoToOrcamentoResponse {

    @Override
    public OrcamentoResponse toOrcamentoResponse(Orcamento orcamento) {
        if ( orcamento == null ) {
            return null;
        }

        OrcamentoResponseBuilder orcamentoResponse = OrcamentoResponse.builder();

        orcamentoResponse.nomeCliente( orcamento.getNomeCliente() );
        orcamentoResponse.endereco( orcamento.getEndereco() );
        orcamentoResponse.orcamentoResponseList( orcamentoItemListToOrcamentoResponseList( orcamento.getOrcamentoItens() ) );
        orcamentoResponse.id( orcamento.getId() );

        return orcamentoResponse.build();
    }

    protected OrcamentoResponse orcamentoItemToOrcamentoResponse(OrcamentoItem orcamentoItem) {
        if ( orcamentoItem == null ) {
            return null;
        }

        OrcamentoResponseBuilder orcamentoResponse = OrcamentoResponse.builder();

        orcamentoResponse.id( orcamentoItem.getId() );

        return orcamentoResponse.build();
    }

    protected List<OrcamentoResponse> orcamentoItemListToOrcamentoResponseList(List<OrcamentoItem> list) {
        if ( list == null ) {
            return null;
        }

        List<OrcamentoResponse> list1 = new ArrayList<OrcamentoResponse>( list.size() );
        for ( OrcamentoItem orcamentoItem : list ) {
            list1.add( orcamentoItemToOrcamentoResponse( orcamentoItem ) );
        }

        return list1;
    }
}
