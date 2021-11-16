package br.com.estudos.usecase.mapper;

import br.com.estudos.adapter.in.dto.ItemRequest;
import br.com.estudos.domain.ItemEntity;
import br.com.estudos.domain.ItemEntity.ItemEntityBuilder;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-21T16:55:32-0300",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 1.8.0_292 (Private Build)"
)
@Component
public class ItemRequestToItemEntityMapperImpl implements ItemRequestToItemEntityMapper {

    @Override
    public ItemEntity toItemEntity(ItemRequest itemRequest) {
        if ( itemRequest == null ) {
            return null;
        }

        ItemEntityBuilder itemEntity = ItemEntity.builder();

        itemEntity.describe( itemRequest.getDescribeItem() );
        itemEntity.valor( itemRequest.getValorItem() );

        return itemEntity.build();
    }
}
