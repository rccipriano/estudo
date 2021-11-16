package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.ItemResponse;
import br.com.estudos.adapter.in.dto.ItemResponse.ItemResponseBuilder;
import br.com.estudos.domain.ItemEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-21T16:55:32-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_292 (Private Build)"
)
@Component
public class ItemEntityToItemResponseMapperImpl implements ItemEntityToItemResponseMapper {

    @Override
    public ItemResponse toItemResponse(ItemEntity itemEntity) {
        if ( itemEntity == null ) {
            return null;
        }

        ItemResponseBuilder itemResponse = ItemResponse.builder();

        itemResponse.idItem( itemEntity.getId() );
        itemResponse.describeItem( itemEntity.getDescribe() );
        itemResponse.valorItem( itemEntity.getValor() );

        return itemResponse.build();
    }
}
